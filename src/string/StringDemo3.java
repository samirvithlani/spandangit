package string;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String email ="samir@gmail.com";
		
		boolean flag = email.contains("@");
		System.out.println(flag);
		
		/********************************/
		String password ="hello123";
		String cnfpassword ="hello123";
		
		boolean flag1 = password.equals(cnfpassword);
		System.out.println("flag 1 ="+flag1);
		
		if(flag1 == true){
			System.out.println("both password are same..");
			
		}
		else{
			
			System.out.println("both password are diff..");
		}
		
	}
}
