package JavaFund;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods d = new Methods();
		String status = d.getData();
		System.out.println(status);
		Method2 d2 = new Method2();
		String status2 = d2.getData2();
		System.out.println(status);
		String name = getName();
		System.out.println(name);
		
	}
	public String getData() {
		System.out.println("data1");
		return "success";
	}
	
	public static String getName() {
		System.out.println("minaz");
		return "khan";
	}

}
