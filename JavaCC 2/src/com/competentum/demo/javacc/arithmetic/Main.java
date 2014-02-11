package com.competentum.demo.javacc.arithmetic;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		String expression = "1./2/3+453.2e1-8.*(6-(2+3))/17*(1.2)";
		InputStream stream = new ByteArrayInputStream(expression.getBytes("UTF-8"));
		Arithmetic parser = new Arithmetic(stream);
		System.out.println("Actual: " + parser.parse());
		System.out.println("Expected: " + (1./2/3+453.2e1-8.*(6-(2+3))/17*(1.2)));
	}
}
