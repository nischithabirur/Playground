import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int first=num/100;
      int thi=num%10;
      int sum=first+thi;
System.out.println (sum);
	}
}