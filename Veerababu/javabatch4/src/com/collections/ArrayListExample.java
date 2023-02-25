package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	//what is collection framework?
	//framework means ready to use like mobile we need buy we can use or apartment house we need to perches directly we join house like seniors we use framework
	//we need to store multiple objects  as single unit that time we should go for collection framework
	//collection interface is one interface it has extends three interfaces they are List and Set,Que interfaces
	
	//list is a interface it is is implements sub class is available they are Arraylist ,linkedList and Vector and stack classes
// list is interface it is insertion order is preserved and duplicates is allowed  null insertion is also available.
	public static void main(String[] args) {
		
         List<Integer> list=new ArrayList();
         
         
			/*
			 * list.add("veera"); list.add("nagalakshmi"); list.add("pavan");
			 * list.add("naresh"); list.add("sivaji"); list.add("gopi");
			 */
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.add(70);
         list.add(10);
         list.add(20);
         list.add(30);
         System.out.println(list);
         Collections.sort(list);
         System.out.println(list);
         Iterator itr   =list.iterator();
         //int index=0;
			/*
			 * while(itr.hasNext()) { if(index<7) { System.out.println(itr.next()); }
			 * index++; }
			 */
		
         //System.out.println(list);
		
        // list.set(4, 100);
         //System.out.println(list);
        // System.out.println(list.lastIndexOf(20));
      // int number  =list.size();
      // System.out.println(number);
		
	}

}
