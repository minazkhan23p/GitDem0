package pack2;

public class child extends parent{
	public void test(){
		System.out.println("child");
	}
	
	public void test2(){
		System.out.println("child2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p =new child();
		p.test();
	

	}

}
