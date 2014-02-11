package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTMulNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTMulNode extends SimpleNode {
	public ASTMulNode(int id) {
		super(id);
	}

	public ASTMulNode(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public Value eval(Map<String, Value> symbolTable)throws InterpreterException {
		if(jjtGetNumChildren() < 1)
			throw new InterpreterException();
		Value value = getChild(0).eval(symbolTable);
		for (int i = 1; i < jjtGetNumChildren(); i++)
			value = mul(value, getChild(i).eval(symbolTable));

		return value;
	}
	
	private Value mul(Value a, Value b) throws InterpreterException {
		if(a == null || b == null)
			throw new InterpreterException();
		if(a.getType() == Type.INT && b.getType() == Type.INT)
			return new Value(Type.INT, (int)a.getValue() * (int)b.getValue());
		throw new InterpreterException();
	}
}
/*
 * JavaCC - OriginalChecksum=6a250158162180b5ac602cb138fcaf56 (do not edit this
 * line)
 */
