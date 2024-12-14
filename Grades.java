package Day04;
import java.util.*;
public class Grades {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks to calculate grade");
int per=sc.nextInt();
	
	if((per>=90) && (per<100)) 
	{
		System.out.println("grade= A+");
	}
	else if((per>=80 ) && (per<90)) {
			System.out.println("garde = A");
		}
	else if((per>=70 )&& (per<80))
		{
			System.out.println("garde= B+");
		}
	else if((per>=60 ) && (per<70))
		{
			System.out.println("garde= B");
		}
	else if((per>=50) &&( per<60))
		{
			System.out.println("garde= c");
		}
	
	else {
		System.out.println("fail");
	}
}
}
