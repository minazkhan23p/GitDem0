package progPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//File obj = new File("C:\\Minaz\\Selenium\\JavaFund\\src\\progPractice\\my.txt");
//if(obj.createNewFile()) {
//	System.out.println("created file"+obj.getName());
//}
//else {
//	System.out.println("created fileexists");
//}
//
//	}
		FileWriter wr = new FileWriter("C:\\\\Minaz\\\\Selenium\\\\JavaFund\\\\src\\\\progPractice\\\\my.txt");
		wr.write("Hello World");
		wr.close();
		
//		File obj = new File("C:\\Minaz\\Selenium\\JavaFund\\src\\progPractice\\my.txt");
//		Scanner sc = new Scanner(obj);
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//			
//		}
//		sc.close();
	}
	

}
