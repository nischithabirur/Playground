import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner (System.in);
      int y=sc.nextInt ();
      if(((y%4==0)&&(y%100!=0))||(y%100==0)&&(y%400)==0)
      {
        System.out.println ("Leap year");}
      else 
      {
        System.out.println ("Non Leap year");
      }
    }
}