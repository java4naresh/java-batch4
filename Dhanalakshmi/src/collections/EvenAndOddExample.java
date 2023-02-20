package collections;

public class EvenAndOddExample {

	public static void main(String[] args) {
	int a[] = {2,1,5,4,8,6,9,3};
	System.out.println("odd Numbers:");
	
	for(int i = 0; i<a.length; i++) {
		if(a [i]%2!=0) {
			System.out.println(a[i]);//1,5,9,3
				
		}
		
	}
	
	System.out.println("Even Numbers:");
	for(int i=0; i<a.length; i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]);//2,4,8,6
		}
		
	}


	}

}
