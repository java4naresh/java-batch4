package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapLanguages {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("AndhraPradesh", "Telugu");
		languages.put("Telangana", "Telugu & Hindi");
		languages.put("Karnataka", "kannada");
		languages.put("Tamilnadu", "Tamil");
		languages.put("Delhi", "Hindi");
		languages.put("Kerala", "Malayalam");
		System.out.println(languages);

	}

}
