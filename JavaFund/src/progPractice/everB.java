package progPractice;

public class everB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		String str = "You are giving an interview";
		String [] arr = str.split(" ");
		for(String a:arr) {
		char First= a.charAt(0);
		char last = a.charAt(a.length()-1);
		System.out.println(a.indexOf('Y'));

sb.append(last).append(a.substring(1, a.length()-1)).append(First).append(" ");
//String newWord = a.replaceAll("^.", Character.toString(last)).replaceAll(".$", Character.toString(First));


		}
		System.out.println(sb);

	}

}
