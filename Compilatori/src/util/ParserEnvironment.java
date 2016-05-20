package util;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.Token;

public class ParserEnvironment {
	public final int ERR_ALREADY_DECLARED = 0;
	public final int ERR_UNDECLARED = 1;
	public final int ERR_NO_VALUE = 2;
	public final int ERR_DIV_BY_0 = 3;
	public final int ERR_UNDEFINED_OP = 4;
	public final int ERR_TYPE_MISMATCH = 5;

	public Hashtable<String, Value> symbolTable = null;
	public ArrayList<String> errorList = null;
	public StringBuffer translation = null;
	
	
	
	public ParserEnvironment () {
		symbolTable = new Hashtable<String, Value> (101);		// 101 numero primo
		errorList = new ArrayList<String>();
		translation = new StringBuffer ();
	}
	
	// esegue l'operazione di println
	public void println (Value v) {
		translation.append(v.value + "\n");
	}

	// concatenazione di strighe
	public Value concat (Value v1, Value v2) {
		Value value = new Value(v1.type, (v1.value + v2.value), false);
		return value;
	}

	// inserisce una variabile nella symbol table
	public void addNewVariable (Token type, Token name) {
		if (symbolTable.containsKey(name.getText())) 
			addErrorMessage (name, ERR_ALREADY_DECLARED);			
		else
			symbolTable.put(name.getText(), new Value (name.getText(), type.getText()));
	}

	
	// controlla se una var è in symbol table
	public void checkDeclaration (Token var) {
		if (!isDeclared(var))
			addErrorMessage (var, ERR_UNDECLARED);					
	}

	// assegna un valore ad una variabile (dichiarata)
	public void assignValue (Token nameVar, Value value, Token eq) {
		if (!isDeclared(nameVar))
			;//addErrorMessage (nameVar, ERR_UNDECLARED);
		else {
			Value var = symbolTable.get(nameVar.getText());
			if (!ValueTypes.isCoherent (value.type, var.type))
				addErrorMessage (nameVar, ERR_TYPE_MISMATCH);
			else
				var.value = value.value;
		}
	}

	// restituisce il tipo di una variabile
	public String getVarType (Token var) {
		if (isDeclared(var))
			return symbolTable.get(var.getText()).type;
		return ValueTypes.UNDEFINED_STR;
	}


	// true se una var è in symbol table
	public boolean isDeclared (Token var) {
		if (!symbolTable.containsKey(var.getText()))
			return false;
		return true;
	}

	// crea un valore temporaneo che deriva da una costante o da un risultato parziale
	public Value setValue (Token vl, String type, String expectedType) {
		String value = vl.getText();
		if (!ValueTypes.isCoherent(type, expectedType)) {
			type = ValueTypes.UNDEFINED_STR;
			addErrorMessage (vl, ERR_TYPE_MISMATCH);
		}
		if (type.equals(ValueTypes.STRING_STR))
			value = value.substring(1, value.lastIndexOf("\""));
		return new Value (type, value, false);
	}

	
	// recupera il valore di una variabile dichiarata
	public Value getDeclaredValue (Token var, String expectedType) {
		Value value = null;
		if (!isDeclared(var)) {
			addErrorMessage (var, ERR_UNDECLARED);
			value = new Value (ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // creo un oggetto fittizio di comodo
		} else {
			value = symbolTable.get(var.getText());  // recupero il valore della variabile dalla symboltable
			if (!value.isInitialized())
				addErrorMessage (var, ERR_NO_VALUE);
			if (!ValueTypes.isCoherent (value.type, expectedType))
				addErrorMessage (var, ERR_TYPE_MISMATCH);
		}
		return value;
	}

	
	// esegue l'operazione +
	public Value doAdd (Token op, Value v1, Value v2) {
		String value;
		String type = ValueTypes.returnType("+", v1.type, v2.type);
		if (type.equals(ValueTypes.UNDEFINED_STR)) {
			addErrorMessage (op, ERR_UNDEFINED_OP);
			return new Value (ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
		}
		if (type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR))
			value = v1.value + v2.value;
		else if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
			value = new Float(Float.parseFloat(v1.value) + Float.parseFloat(v2.value)).toString();
		else  // if (type.equals(ValueTypes.INT_STR))
			value = new Integer(Integer.parseInt(v1.value) + Integer.parseInt(v2.value)).toString();
		return new Value (type, value, false);
	}

	// esegue l'operazione -
	public Value doSub (Token op, Value v1, Value v2) {
		String value;
		String type = ValueTypes.returnType("-", v1.type, v2.type);
		if (type.equals(ValueTypes.UNDEFINED_STR) || type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR)) {
			addErrorMessage (op, ERR_UNDEFINED_OP);
			return new Value (ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
		}
		if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
			value = new Float(Float.parseFloat(v1.value) - Float.parseFloat(v2.value)).toString();
		else  // if (type.equals(ValueTypes.INT_STR))
			value = new Integer(Integer.parseInt(v1.value) - Integer.parseInt(v2.value)).toString();
		return new Value (type, value, false);
	}	

	// esegue l'operazione *
	public Value doMul (Token op, Value v1, Value v2) {
		String value;
		String type = ValueTypes.returnType("*", v1.type, v2.type);
		if (type.equals(ValueTypes.UNDEFINED_STR) || type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR)) {
			addErrorMessage (op, ERR_UNDEFINED_OP);
			return new Value (ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
		}
		if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
			value = new Float(Float.parseFloat(v1.value) * Float.parseFloat(v2.value)).toString();
		else  // if (type.equals(ValueTypes.INT_STR))
			value = new Integer(Integer.parseInt(v1.value) * Integer.parseInt(v2.value)).toString();
		return new Value (type, value, false);
	}
	
	// esegue l'operazione /
	public Value doDiv (Token op, Value v1, Value v2) {
		String value;
		String type = ValueTypes.returnType("/", v1.type, v2.type);
		if (type.equals(ValueTypes.UNDEFINED_STR) || type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR)) {
			addErrorMessage (op, ERR_UNDEFINED_OP);
			return new Value (ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
		}
		if (Float.parseFloat(v2.value) == 0) {
			addErrorMessage (op, ERR_DIV_BY_0);			
			return new Value (ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
		}
		if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
			value = new Float(Float.parseFloat(v1.value) / Float.parseFloat(v2.value)).toString();
		else  // if (type.equals(ValueTypes.INT_STR))
			value = new Integer(Integer.parseInt(v1.value) / Integer.parseInt(v2.value)).toString();
		return new Value (type, value, false);
	}
	
	
	// aggiunge un messaggio d'errore semantico
	public void addErrorMessage (Token tk, int code) {
		String msg = "Errore Semantico [" + code + "] in (" + tk.getLine() + "," + tk.getCharPositionInLine() + ") - ";

		if (code == ERR_ALREADY_DECLARED) 
			msg += "La variabile <" + tk.getText() + "> è già stata dichiarata"; 
		else if (code == ERR_UNDECLARED)
			msg += "La variabile <" + tk.getText() + "> non è stata dichiarata"; 
		else if (code == ERR_TYPE_MISMATCH)
			msg += "Valore di tipo non compatibile"; 
		else if (code == ERR_UNDEFINED_OP)
			msg += "L'operatore <" + tk.getText() + "> non è definito per i due operandi"; 
		else if (code == ERR_DIV_BY_0)
			msg += "Divisione per 0"; 
		else if (code == ERR_NO_VALUE)
			msg += "La variabile <" + tk.getText() + "> non è stata inizializzata"; 
		else 
			msg += "Errore non definito sul token <" + tk.getText() + ">"; 
		
		errorList.add(msg);
	}
}
