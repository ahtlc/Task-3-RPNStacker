import java.io.File;

import java.io.FileNotFoundException;
import java.util.*;
import utils.ToNumber;

import token.Token;
import token.TokenType;

import Regex.Regex;

public class ReadFile {
	public List<Token> readFile()throws FileNotFoundException {
		
		List<Token> tokens = new ArrayList<Token>();
		String f = System.getProperty("user.dir")+"\\src\\Calc1.txt";
		File myObj = new File(f);
		Scanner myReader = new Scanner(myObj);
		
		while (myReader.hasNextLine()) {
			String line = myReader.nextLine().trim();
			Token token;
			
			if (Regex.isNum(line)) {
				token = new Token(TokenType.NUM, line);
			} else if (Regex.isOP(line)) {
				token = new Token(Regex.getOPTokenType(line), line);
			}
			else {
            	myReader.close();
            	throw new RuntimeException("Error: Unexpected character: " + line);
            }
			tokens.add(token);
			System.out.println("Token [type=" + token.type + ", lexeme=" + line + "]");
      	}
      	myReader.close();
      	return tokens;
	}
}


/*public class ReadFile {
	public ArrayList<String> readFile()throws FileNotFoundException {
		ArrayList<String> datas = new ArrayList<String>();
		String f = System.getProperty("user.dir")+"\\src\\Calc1.txt";
		File myObj = new File(f);
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
	        datas.add(data);
	        System.out.println(data);
	      }
	      myReader.close();
	      return datas;
	}
}
*/