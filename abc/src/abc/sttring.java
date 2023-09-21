package abc;

import java.util.ArrayList;

public class sttring {

	public static void main(String[] args) {
		String a ="abccbdeef";
		String b="";
		StringBuilder str = new StringBuilder(a);
		int threshold =2;
		//ArrayList<String> arr= new ArrayList<String>();
		//while(b)
		for(int i=0;i<=a.length();i++) {
			int count=1;
			if(i==a.length()-1) {
				b=b.concat(Character.toString(a.charAt(i)));
				break;
			}
			
			if(a.charAt(i)==a.charAt(i+1)) {
				count++;
				i++;
				if(count >threshold) {
					b=b.concat(Character.toString(a.charAt(i)));

	
				}
				
			}
			else {
				b=b.concat(Character.toString(a.charAt(i)));
				
			
			}
		}
		System.out.println(b);
	}
}
