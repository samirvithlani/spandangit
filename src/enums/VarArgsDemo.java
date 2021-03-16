package enums;

public class VarArgsDemo {

	
	public void add(int a){
		
		System.out.println(a);
	}
	
	public void demo(int...a){
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		VarArgsDemo v1 = new VarArgsDemo();
		//v1.add(20);
		//v1.demo("jay",10,20,30,40,50);
				
		
	}
}

