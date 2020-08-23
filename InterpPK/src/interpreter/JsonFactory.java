package interpreter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFactory {
	public static String jFacto(String json) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(json);
        JSONObject parse_message = (JSONObject) object.get("message");
        JSONObject parse_response_result = (JSONObject) parse_message.get("result");
        String translatedText = (String) parse_response_result.get("translatedText");
		return translatedText;
	}
}
