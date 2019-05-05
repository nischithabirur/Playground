import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt ();
      int val=1;
      for (int r=1;r <=n;r++)
      {
        for (int space=1;space <=(n-r);space++)
        {
          System.out.print(" ");
        }
        for (int c=1;c <=r;c++)
        {
          System.out.print (val + " ");
          val++;
        }
        System.out.println ();
      }
    }    
}