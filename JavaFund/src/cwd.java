

import java.util.ArrayList;

public class cwd {

public static void main(String[] args) { // TODO Auto-generated method stub

String a ="hello world heyw"; // Print unique number from the list- Amazon  //print the string in reverse 
ArrayList<String>ab =new ArrayList<String>(); 
for(int i=0;i<a.length();i++) { 
	int k=0; 
	String str1=Character.toString(a.charAt(i));
	if(!ab.contains(str1)) { 
		
		ab.add(str1);
		k++; 
		for(int j=i+1;j<a.length();j++) { 
			String str2=Character.toString(a.charAt(j));
			if(str1.equals(str2)) { k++;
			} 
			} // 
		if(k==1){ System.out.println(str1); 
		break;} } 
	}
		}
	
}

