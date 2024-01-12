package progPractice;

import java.util.LinkedHashSet;

public class duplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to remove duplicates 
		String str = "aaancdondiowmdaaahhhdndlhh";
		LinkedHashSet<Character> a1 = new LinkedHashSet<Character>();
		for(Character ch : str.toCharArray()) {
			a1.add(ch);
			
		}
		System.out.println(a1);
		StringBuilder sb = new StringBuilder();
		for(Character charac:a1) {
			sb.append(charac);
		}
		System.out.println(sb);
	}

}
