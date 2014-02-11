package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTIf.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTIf extends SimpleNode {
	public ASTIf(int id) {
		super(id);
	}

	public ASTIf(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public Value eval(Map<String, Value> symbolTable)
			throws InterpreterException {
		if (jjtGetNumChildren() != 2 && jjtGetNumChildren() != 3)
			throw new InterpreterException();

		Value condition = getChild(0).eval(symbolTable);
		if (condition.getType() != Type.BOOL)
			throw new InterpreterException();
		if ((boolean) condition.getValue())
			getChild(1).eval(symbolTable);
		else if (jjtGetNumChildren() != 3)
			getChild(2).eval(symbolTable);
		return null;
	}

}
/*
 * JavaCC - OriginalChecksum=c59b313e1dfb51ac3c10eff6c76cf769 (do not edit this
 * line)
 */
