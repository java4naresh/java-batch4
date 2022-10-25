class Operators {
public static void main(String[] args) {
		
String name = "vasavi";//assignment operator
int a = 20;
int b = 50;
boolean equal = a == b; //(== equality operator)
System.out.println(equal);//false
boolean equal2 = a!=b;//(!= equality operator)
System.out.println(equal2);//true
System.out.println(a);//20
a++;
System.out.println(a); //21
System.out.println(b);//50
b++;
System.out.println(b); //51
System.out.println(++a + b++ + ++a);//96 22 + 52 + 22
System.out.println(a);//23
System.out.println(b);//52
System.out.println(++a + b++ + a++ + ++b);//154 24+53+24+53
System.out.println(a);//25
System.out.println(b);//54
}
}