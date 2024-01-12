
public class finalchild extends Finalparent{// extends Finalparent not allowed 

	
	public void getdata(){//canot be overriden by child by using extend 
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		
		Finalparent f=new Finalparent();//allowed
		// TODO Auto-generated method stub

	}
	

}
