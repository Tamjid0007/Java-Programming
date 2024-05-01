 public class P45_3
 {
 public static void main(String args[])
 {
 try
 {
 int a=10;
 int b=0;
 int c=a/b;
 System.out.println("Result: "+c);
 }
 catch(ArithmeticException e)
 {
 System.out.println("Caught an exception :"+e.getMessage());
 }
 System.out.println("End of program"); }
 }
