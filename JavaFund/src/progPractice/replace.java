package progPractice;

import java.io.File;
import org.apache.commons.io.FileUtils;
public class replace {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File obj = new File("C:\\Minaz\\Selenium\\JavaFund\\src\\progPractice\\my.txt");
		String data = FileUtils.fileRead("C:\\Minaz\\Selenium\\JavaFund\\src\\progPractice\\my.txt").toString();
		data = data.replace("World","word");
		FileUtils.fileWrite("C:\\\\Minaz\\\\Selenium\\\\JavaFund\\\\src\\\\progPractice\\\\my.txt", data);
	}

}
