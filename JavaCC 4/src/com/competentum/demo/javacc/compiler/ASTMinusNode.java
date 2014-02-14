package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTMinusNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTMinusNode extends SimpleNode {
	public ASTMinusNode(int id) {
		super(id);
	}

	public ASTMinusNode(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable)throws InterpreterException {
		if(jjtGetNumChildren() < 1)
			throw new InterpreterException();
		AlgValue variable = getChild(0).eval(symbolTable);
		for (int i = 1; i < jjtGetNumChildren(); i++)
			variable = sub(variable, getChild(i).eval(symbolTable));

		return variable;
	}
	
	private AlgValue sub(AlgValue a, AlgValue b) throws InterpreterException {
		if(a == null || b == null)
			throw new InterpreterException();
		if(a.getType() == Type.INT && b.getType() == Type.INT)
			return new AlgValue(Type.INT, (int)a.getValue() - (int)b.getValue());
		throw new InterpreterException();
	}
}
/*
 * JavaCC - OriginalChecksum=9e03691eb8be01feb0e870905c71855c (do not edit this
 * line)
 */
