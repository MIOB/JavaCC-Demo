package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTLTNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTLTNode extends SimpleNode {
  public ASTLTNode(int id) {
    super(id);
  }

  public ASTLTNode(ExampleCompiler p, int id) {
    super(p, id);
  }
  
	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable) throws InterpreterException {
		if(jjtGetNumChildren() != 2)
			throw new IllegalStateException();
		AlgValue a = getChild(0).eval(symbolTable);
		AlgValue b = getChild(1).eval(symbolTable);
		if(a.getType() != Type.INT || b.getType() != Type.INT)
			throw new InterpreterException();
		return new AlgValue(Type.BOOL, (int)a.getValue() < (int)b.getValue());
	}

}
/* JavaCC - OriginalChecksum=d3599bf3e6131589d7531af77960e5c6 (do not edit this line) */
