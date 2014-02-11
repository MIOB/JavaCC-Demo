package com.competentum.demo.javacc.compiler;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTIdentifier extends SimpleNode {

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ASTIdentifier(int id) {
		super(id);
	}

	public ASTIdentifier(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public Value eval(Map<String, Value> symbolTable) {
		return symbolTable.get(name);
	}

}
/*
 * JavaCC - OriginalChecksum=25ff5a103b4943343308dadccfbc8f3c (do not edit this
 * line)
 */
