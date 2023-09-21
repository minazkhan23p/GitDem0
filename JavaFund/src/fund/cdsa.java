package fund;

import java.util.ArrayList;

public class cdsa {
	public static void main(String[] args) {
		String name="mi";
	
		ArrayList<String> arr= new ArrayList<String>() ;
		for(int i=0;i<name.length();i++){
			arr.add(Character.toString(name.charAt(i)));
			
		}

		System.out.println(name.substring(1));
	}
	
}
