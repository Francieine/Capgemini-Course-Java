package application;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
//Etrutrutura para armazena cookies
		Map<String, String> cookies  = new TreeMap<>();
		
		cookies.put("username","Maria");
		cookies.put("email","maria@gmail.com");
		cookies.put("phone","999669999");
		
		cookies.remove("email"); // exclui email
		cookies.put("phone", "999669900");
		
		System.out.println("Contains 'phone' key " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size" + cookies.size());

		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));

		}
		
	}

}
