package com.competentum.demo.javacc.compiler;

public class AlgValue {
	private Type type;
	
	private Object value;

	public AlgValue(Type type, Object value) {
		super();
		this.type = type;
		this.value = value;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
