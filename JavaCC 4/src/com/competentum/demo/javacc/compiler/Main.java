package com.competentum.demo.javacc.compiler;
public class Main {
	public static void main(String[] args) throws ParseException, InterpreterException {
		ExampleCompiler compiler;

		compiler = new ExampleCompiler(
				Main.class.getResourceAsStream("example.l"));

		ASTCompilationUnit unit = compiler.compile();
		//unit.dump("");
		
		unit.eval();
	}
}
