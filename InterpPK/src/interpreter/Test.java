package interpreter;

import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) {	
		try {
			System.out.println(JsonFactory.jFacto(PapagoAPI.interpret("�������� ���� �ɸ��׿�")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
