import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=0,i=0;
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i+"");
        }
      }
        
      
	}
}