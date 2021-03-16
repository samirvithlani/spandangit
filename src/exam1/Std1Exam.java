package exam1;
/*
 * access modifiers
 * 
 * public
 * default
 * protected
 * private
 * */
//class can not be private...
public class Std1Exam {


		private int marks=100;
		public int value =200;
		
		public void demo(){
			
			System.out.println(marks);
		}
		private void abc(){
			
			
		}
		
		public static void main(String[] args) {
		
		
			Std1Exam s1 = new Std1Exam();
			s1.demo();
			
		}
}
