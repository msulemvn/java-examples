//Driver 
public class Main{
	public static void main(String args[]){
		System.out.println("This is the static main function in the Main class which is the driver class");
		Class_A objectClass_A = new Class_A();
		objectClass_A.functionClass_A();

		Class_B objectClass_B = new Class_B();
		objectClass_B.functionClass_B();
	}
}
