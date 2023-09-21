package JavaFund;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.ArrayList<String> a = new java.util.ArrayList<String>();
a.add("m");
a.add("i");
a.add("n");
a.add("a");
a.add("z");
System.out.println(a.get(2));

String s = "minaz a khan";
String[] splitString = s.split(" a ");
System.out.println(splitString[1]);
for(int i=s.length()-1;i>=0;i--) {

System.out.print(s.charAt(i));


	}

}
}