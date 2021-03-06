package com.competentum.demo.javacc.compiler;
import java.util.HashMap;
import java.util.Map;

/* Generated By:JJTree: Do not edit this line. ASTCompilationUnit.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTCompilationUnit extends SimpleNode {
	public ASTCompilationUnit(int id) {
		super(id);
	}

	public ASTCompilationUnit(ExampleCompiler p, int id) {
		super(p, id);
	}

	@Override
	public AlgValue eval(Map<String, AlgValue> symbolTable) throws InterpreterException {
		for (int i = 0; i < jjtGetNumChildren(); i++) {
			getChild(i).eval(symbolTable);
		}
		return null;
	}
	

	public Map<String, AlgValue> eval() throws InterpreterException {
		Map<String, AlgValue> symbolTable = new HashMap<String, AlgValue>();
		eval(symbolTable);
		return symbolTable;
	}



}
/*
 * JavaCC - OriginalChecksum=2cc9bbda1a9ade0074d1c5d63e3c9b94 (do not edit this
 * line)
 */
