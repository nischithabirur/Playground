import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n =sc.nextInt ();
      for ( int r=1;r <=n;r++)
      {
        for (int c=1;c <=n;c++)
        {
          System.out.print(r);
        }
     System.out.print ("\n");
      }
	}
}