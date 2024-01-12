import java.util.ArrayList;
import java.util.Scanner;

public class tryno {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
int number = Integer.parseInt(obj.nextLine());
for(int i=2;i<=number;i++) {
	int currentNumber=i;
	boolean isPrime=true;
	for(int j=currentNumber-1;j>=2;j--) {
		if(currentNumber%j==0) {
			isPrime=false;
		}
	}
	if(isPrime) {
		System.out.println(currentNumber);
	}
}

	}}



