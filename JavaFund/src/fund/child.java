package fund;

public class child extends parent{
	public void test2(){
		System.out.println("child");
	}
	public void test(){
		System.out.println("child1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent c=new child();
c.test();
parent c2=new parent();
c2.test();
child c3 = new child();
c3.test();
c3.test2();
child c4 = (child) new parent();
c4.test();
c4.test2();

	}

}
