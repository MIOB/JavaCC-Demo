package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTUnaryMinusNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTUnaryMinusNode extends SimpleNode {
  public ASTUnaryMinusNode(int id) {
    super(id);
  }

  public ASTUnaryMinusNode(ExampleCompiler p, int id) {
    super(p, id);
  }

	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable) throws InterpreterException {
		if(jjtGetNumChildren() != 1)
			throw new InterpreterException();
		AlgValue variable = getChild(0).eval(symbolTable);
		if(variable.getType() != Type.INT)
			throw new InterpreterException();
		return new AlgValue(Type.INT, -(int) variable.getValue());
	}
}
/* JavaCC - OriginalChecksum=aa96e95356d58bcfbc056e47239c4854 (do not edit this line) */
