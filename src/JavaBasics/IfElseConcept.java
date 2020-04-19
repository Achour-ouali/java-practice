package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		int d=45;
		if(a>d) {
			System.out.println("a is greater than b");
			
		}else {
			
			System.out.println("b is greater than a");
			
			}
		
		//comparison operators;
		
		int c=55;
		int r=45;
		
		if(c==r) {
			
			System.out.println("c is equal to r");
				
		}else {
			
			System.out.println("c and r are not equal");
		}
		
		//nested if-else
		
		
		int a1=120;
		int a2=235;
		int a3=666;
		
		if (a1>a2 & a1>a3) {
			
			System.out.println("a is greatest");
		}else if (   a2>a3) {
			System.out.println("a2 is greatest");
			
			
		}else {
			
			
			System.out.println("a3 is greatest");
		}
		
		
		
		

	}

}
