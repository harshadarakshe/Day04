package Day04;
import java.util.*;
public class MenuDrivenApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Your choices are"+"1.Addition"+"2.multiplication"+"3.divion"+"4.substraction");
	System.out.println("Enter no1");
	System.out.println("enter no2");
	
	int ch=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	int total;
	switch (ch){
	case 1:
		total=a+b;
		System.out.println("Addition="+total);
		break;
	case 2:
		total=a*b;
		System.out.println("multiplication"+total);
		 break;
	case 3:
		total=a/b;
		System.out.println("division"+total);
		break;
	case 4:
		total=a-b;
		System.out.println("substraction"+total);
		default :
			System.out.println("Invalid choice");
		
	}
}
}
