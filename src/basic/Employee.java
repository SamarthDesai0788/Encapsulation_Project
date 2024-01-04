package basic;

public class Employee {
		int empid;
		String empname;
		Employee()
		{
		this(215);
		System.out.println("constrcutor 1");
		}
		Employee(int empid){
        this(314,"Rahul");
		System.out.println("constructor 2");
          this.empid=empid;
		}
		Employee(int empid,String empname)
		{
		this.empid=empid;
		this.empname=empname;
		System.out.println("constrctor 3");
		}
public static void main(String[] args) {
		Employee e1=new Employee();
		
	}
}
