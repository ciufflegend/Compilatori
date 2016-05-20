package util;

import java.util.Hashtable;

public class ValueTypes {
	public static final int UNDEFINED = 0;
	public static final int NUMERIC = 1;
	public static final int INT = 2;
	public static final int FLOAT = 3;
	public static final int STRING = 4;
	public static final int ANYVALUE = 5;
	public static final String UNDEFINED_STR = "UNDEFINED";
	public static final String NUMERIC_STR = "NUMERIC";
	public static final String INT_STR = "int";
	public static final String FLOAT_STR = "float";
	public static final String STRING_STR = "String";
	public static final String ANYVALUE_STR = "ANYVALUE";
	
	// matrice dei risultati per l'operatore +   			: algebra delle stringhe 
	public static final int [][] addMatrix = new int [][] 
		{	{0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 4, 1},
			{0, 1, 2, 3, 4, 2},
			{0, 1, 3, 3, 4, 3},
			{0, 4, 4, 4, 4, 4},
			{0, 1, 2, 3, 4, 5} };

	// matrice dei risultati per gli operatori - * /  : algebra delle strighe non è definita
	public static final int [][] opMatrix = new int [][] 
		{	{0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 1},
			{0, 1, 2, 3, 0, 2},
			{0, 1, 3, 3, 0, 3},
			{0, 0, 0, 0, 0, 0},
			{0, 1, 2, 3, 0, 5} };

	// matrice di coerenza degli assegnamenti: (typo, typo atteso)
	public static final boolean [][] coherenceMatrix = new boolean[][] 
		{	{false, false, false, false, false, false},
			{false, true,	 false, true,	 true, 	true},
			{false, true,	 true, 	true,	 true, 	true},
			{false, true,  false, true,	 true, 	true},
			{false, false, false, false, true, 	true},
			{false, true,	 false, true,	 true, 	true} };

	public static String [] stringTypes = new String [] {UNDEFINED_STR, NUMERIC_STR, INT_STR, FLOAT_STR, STRING_STR, ANYVALUE_STR};
	public static Hashtable<String, Integer> types;  	
	static {
		types = new Hashtable<String, Integer>();
		for (int i=0; i<stringTypes.length;i++) 
			types.put(stringTypes[i], i); 
	}

	// restituisce il tipo di ritorno in base all'operatore ai tipi degli operatori
	public static String returnType (String operator, String type1, String type2) {
		int t, t1, t2;
		t1 = types.get(type1);
		t2 = types.get(type2);

		if (operator.equals("+")) 
			t = addMatrix [t1][t2];
		else
			t = opMatrix [t1][t2];
		return stringTypes[t];
	}

	// restituisce true se un certo tipo e compatibile con quello atteso
	public static boolean isCoherent (String type, String expectedType) {
		int t1, t2;
		t1 = types.get(type);
		t2 = types.get(expectedType);
		return coherenceMatrix [t1][t2];
	}

}