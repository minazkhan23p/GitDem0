
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder result = new StringBuilder();
		    for (int r = 1; r <= 9; r++) {
		        for (int sp = 1; sp <= 9 - r; sp++) {
		            result.append(" ");
		        }
		        for (int c = 1; c <= (r * 2) - 1; c++) {
		            result.append("*");
		        }
		        result.append(System.lineSeparator());
		    }
		    System.out.println(result);
	}

}
