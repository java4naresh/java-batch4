package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Even {
	
public static void main(String[] args) {
   
	 ArrayList<Integer> even = new ArrayList<Integer>();
     ArrayList<Integer> odd = new ArrayList<Integer>();	
		List<Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
			
		System.out.println(list);
		
		for(int i=0;i<list.length;i++){
		    //list=read.nextInt();
		    if(list%2==0)
		        even.addAll(list);
		    else
		        odd.addAll(list);
		}
		System.out.println("Even number is " + even);
		System.out.println("Odd number is " + odd);
		
		
		
		/*List<Integer>list = new ArrayList<Integer>();
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13} ;
	
		for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
		list.add(arr[i]);
		}
		}
		Collections.sort(list);	
		for(int even : list)
		System.out.print(even +",");*/	
		
		
		
		/*List<Integer>list = new ArrayList<Integer>();
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13} ;
	
		for(int i=0;i<arr.length;i++){
		if(arr[i]%2!=0){
		list.add(arr[i]);
		}
		}
		Collections.sort(list);	
		for(int odd : list)
		System.out.print(odd +",");	
		*/
  }

}
