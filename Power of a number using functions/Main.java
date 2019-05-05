import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      System.out.print(p_of_num(b,e));
    }
  public static int p_of_num(int b,int e)
  {
    int power=1;
    while(e>=1)
    {
      power=power*b;
      e--;
    }
    return power;}
}
	


