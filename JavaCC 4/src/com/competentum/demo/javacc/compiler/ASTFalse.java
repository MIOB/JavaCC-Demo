package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTFalse.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTFalse extends SimpleNode {
	public ASTFalse(int id) {
		super(id);
	}

	public ASTFalse(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public Value eval(Map<String, Value> symbolTable) {
		return new Value(Type.BOOL, false);
	}

}
/*
 * JavaCC - OriginalChecksum=6063f8f50fbc00016ff509d81b45661c (do not edit this
 * line)
 */
