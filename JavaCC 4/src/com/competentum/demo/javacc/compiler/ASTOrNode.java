package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTOrNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTOrNode extends SimpleNode {
  public ASTOrNode(int id) {
    super(id);
  }

  public ASTOrNode(ExampleCompiler p, int id) {
    super(p, id);
  }
  
	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable)throws InterpreterException {
		if(jjtGetNumChildren() < 1)
			throw new InterpreterException();
		AlgValue value = getChild(0).eval(symbolTable);
		for (int i = 1; i < jjtGetNumChildren(); i++)
			value = or(value, getChild(i).eval(symbolTable));

		return value;
	}
	
	private AlgValue or(AlgValue a, AlgValue b) throws InterpreterException {
		if(a == null || b == null)
			throw new InterpreterException();
		if(a.getType() == Type.BOOL && b.getType() == Type.BOOL)
			return new AlgValue(Type.BOOL, (boolean)a.getValue() | (boolean)b.getValue());
		if(a.getType() == Type.INT && b.getType() == Type.INT)
			return new AlgValue(Type.INT, (int)a.getValue() | (int)b.getValue());
		throw new InterpreterException();
	}

}
/* JavaCC - OriginalChecksum=d774cd47a47914920a5e0731cdb918dc (do not edit this line) */
