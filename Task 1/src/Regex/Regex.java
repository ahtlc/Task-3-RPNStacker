package Regex;

import token.*;

public class Regex {
	
	private static final String NUM_REGEX = "(\\d)+"; // [0-9]
	private static final String OP_REGEX = "(\\+|-|\\*|/)"; // operações
	private static final String PLUS_REGEX = "(\\+)"; // operação de soma
	private static final String MINUS_REGEX = "(\\-)"; // operação de subttação
	private static final String SLASH_REGEX = "(/)"; // operação de divisão
	private static final String STAR_REGEX = "(\\+)"; // operação de multiplicação
	
	public static boolean isNum(String token) {
		return token.matches(NUM_REGEX);
	}
	
	public static boolean isOP(String token) {
		return token.matches(OP_REGEX);
	}
	
	public static boolean isPLUS(String token) {
		return token.matches(PLUS_REGEX);
	}
	
	public static boolean isMINUS(String token) {
		return token.matches(MINUS_REGEX);
	}
	
	public static boolean isSLASH(String token) {
		return token.matches(SLASH_REGEX);
	}
	
	public static boolean isSTAR(String token) {
		return token.matches(STAR_REGEX);
	}
	
	public static TokenType getOPTokenType(String line) {
		if (line.equals("-")) {
			return TokenType.MINUS;
    	} else if (line.equals("+")) {
    		return TokenType.PLUS;
    	} else if (line.equals("/")) {
    		return TokenType.SLASH;
    	} else if (line.equals("*")) {
    		return TokenType.STAR;
		}
		return null;
	}
}