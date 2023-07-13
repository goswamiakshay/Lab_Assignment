import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int choice, n1,n2,n3,n4,n5,p,n,r,result;
		char input;
		Scanner sc= new Scanner(System.in);
		System.out.println("1: Even ODD\n2:Greater between 5no\n3:Vowels or not\n4:Rate of interest");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter a number");
			n1=sc.nextInt();
			if(n1%2==0)
			{
				System.out.println("EVEN "+n1);
			}
			else
			{
				System.out.println("ODD "+ n1);
			}
			break;
		case 2:
			System.out.println("Enter 5 Number : ");
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=sc.nextInt();
			n4=sc.nextInt();
			n5=sc.nextInt();
			if(n1>n2&&n1>n3&&n1>n4&&n1>n5)
			{
				System.out.println("Number1 is greater " + n1);
				
			}
			else if(n2>n1&&n2>n3&&n2>n4&&n2>n5)
			{
				System.out.println("Number2 is greater " + n2);
			}
			else if(n3>n1&&n3>n2&&n3>n4&&n3>n5)
			{
				System.out.println("Number3 is greater " + n3);
			}
			else if(n4>n1&&n4>n3&&n4>n3&&n4>n5)
			{
				System.out.println("Number4 is greater " + n4);
			}
			else
			{
				System.out.println("Number5 is greater " + n5);
			}
		case 3:
			System.out.println("Enter any character");
			input=sc.next().charAt(0);
			switch(input)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
			System.out.println(input+"is a vowel");
			break;
			default:
			System.out.println(input+"is not a vowel");
			break;
			}
			break;
			
		case 4:
			System.out.println("Enter P, R, N");
			
			p=sc.nextInt();
			r=sc.nextInt();
			n=sc.nextInt();
			result=(p*n*r)/100;
			System.out.println("Rate of Interest is ="+result);
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}
			
	}
}