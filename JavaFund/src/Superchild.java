
public class Superchild extends iDOntHaveBody {
	String name="min";
	
	public  Superchild(){
		super(2);  
		//To get parent constructor 
		System.out.println("child contructor");
		
	}

	public void getdata(){
	
		super.getdata();//to get parent method which is also presnt in child
		System.out.println("child method");
	}
 public void get(){
	 super.getdata();
		System.out.println(name);
		System.out.println(super.name);//to get parent values if the same variable with same name is 
		//created in child which is already present in parent
 }

	public static void main(String[] args) {
		Superchild s=new Superchild();
		
		s.get();
		s.getdata();

		// TODO Auto-generated method stub
	

	}

}
