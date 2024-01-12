package progPractice;

import java.util.Scanner;

public class palindromereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter name");
//		
//		String name=obj.nextLine()
String a="madam";
String b="";
for(int i=a.length()-1;i>=0;i--){
	b=b+a.charAt(i);
	
	
}
System.out.println(b);
if(a.equals(b)){
	System.out.println("pass");
}
	}

}
