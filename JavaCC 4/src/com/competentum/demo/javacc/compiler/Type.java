package com.competentum.demo.javacc.compiler;
public enum Type {
	BOOL("boolean"), INT("int"), STRING("string");

	private String type;

	private Type(String type) {
		this.type = type;
	}

	public static Type getType(String type) {
		for (Type t : values()) {
			if (t.type.equals(type))
				return t;
		}
		return null;
	}
}
