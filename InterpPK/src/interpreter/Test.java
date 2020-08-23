package interpreter;

import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) {	
		try {
			System.out.println(JsonFactory.jFacto(PapagoAPI.interpret("생각보다 오래 걸리네요")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
