package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTAddNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTAddNode extends SimpleNode {
	public ASTAddNode(int id) {
		super(id);
	}

	public ASTAddNode(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public Value eval(Map<String, Value> symbolTable)throws InterpreterException {
		if(jjtGetNumChildren() < 1)
			throw new InterpreterException();
		Value value = getChild(0).eval(symbolTable);
		for (int i = 1; i < jjtGetNumChildren(); i++)
			value = add(value, getChild(i).eval(symbolTable));

		return value;
	}
	
	private Value add(Value a, Value b) throws InterpreterException {
		if(a == null || b == null)
			throw new InterpreterException();
		if(a.getType() == Type.INT && b.getType() == Type.INT)
			return new Value(Type.INT, (int)a.getValue() + (int)b.getValue());
		if(a.getType() == Type.STRING && a.getValue() != null)
			return new Value(Type.STRING, a.getValue().toString() + b.getValue());
		if(b.getType() == Type.STRING && b.getValue() != null)
			return new Value(Type.STRING, a.getValue() + b.getValue().toString());
		throw new InterpreterException();
	}

}
/*
 * JavaCC - OriginalChecksum=ea8acdfcf138d65be603bf5e747fc342 (do not edit this
 * line)
 */
