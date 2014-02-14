package com.competentum.demo.javacc.arithmetic;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		String expression = "1/2/3*34345-(435)+-+00.0";
		InputStream stream = new ByteArrayInputStream(expression.getBytes("UTF-8"));
		Arithmetic parser = new Arithmetic(stream);
		parser.parse();
		
	}
}
