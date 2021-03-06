package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTVarDecalare.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTVarDecalare extends SimpleNode {

	protected Type type;

	public ASTVarDecalare(int id) {
		super(id);
	}

	public ASTVarDecalare(ExampleCompiler p, int id) {
		super(p, id);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable) throws InterpreterException{
		if (jjtGetNumChildren() != 1)
			throw new InterpreterException();
		Node child = jjtGetChild(0);
		if (!(child instanceof ASTIdentifier))
			throw new InterpreterException();
		String name = ((ASTIdentifier) child).getName();
		switch (type) {
		case INT:
			symbolTable.put(name, new AlgValue(type, 0));
			break;
		case BOOL:
			symbolTable.put(name, new AlgValue(type, false));
			break;
		case STRING:
			symbolTable.put(name, new AlgValue(type, ""));
			break;
		}
		return null;
	}

}
/*
 * JavaCC - OriginalChecksum=b08223b5514531d1aff56232ea21f2f3 (do not edit this
 * line)
 */
