package util;

public class Value {
	String name;
	String type;
	String value;
	boolean isVar;
	
	// costruttore per nome e tipo
	public Value (String n, String t) {
		name = n;
		type = t;
		value = null;
		isVar = true;
	}

	// costruttore per valori temporanei
	public Value (String t, String v, boolean b) {
		name = "";
		type = t;
		value = v;
		isVar = b;
	}
	
	public boolean isInitialized () {
		return value != null;
	}
}
