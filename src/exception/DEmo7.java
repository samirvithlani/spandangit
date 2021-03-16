package exception;

class a{
	
	void demo() throws Exception{
		
		System.out.println("demo");
	}
}
public class DEmo7 {

	
	public static void main(String[] args) {
		
		a obj = new a();
		try{
		obj.demo();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
