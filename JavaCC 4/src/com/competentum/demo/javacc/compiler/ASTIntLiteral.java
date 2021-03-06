package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTIntLiteral.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTIntLiteral extends SimpleNode {

	
	protected int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ASTIntLiteral(int id) {
		super(id);
	}

	public ASTIntLiteral(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable) {
		return new AlgValue(Type.INT, value);
	}

}
/*
 * JavaCC - OriginalChecksum=da8b655499608b4fa0b0500ebd67b29c (do not edit this
 * line)
 */
