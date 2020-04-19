package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1-while loop;
		// Disadvantage of while loop; it will generate infinite loop if you dont give incremental/decrementel part
		
		
		int i=1; //initialization
		while(i<=10) {//conditional
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		//2-for loop;
		for(int j=1;j<=50;j++) {
			System.out.println(j);
			
			//j=j++ means j=j+1
			//print 1 to 10
			
		}
		//print 10 to 1
		
		for(int k=10;k>=1;k--) {
		System.out.println(k);
		
	}
		}

}
