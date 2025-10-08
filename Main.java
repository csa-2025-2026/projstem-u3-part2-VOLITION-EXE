import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    
    System.out.println("Please enter a double:");
    double a1 = scan.nextDouble();
    if(a1==12.345)System.out.println("YES");

    System.out.println("Please enter a integer:");
    double b1 = scan.nextInt();
    if(b1==48)System.out.println("YES");
    
    System.out.println("Please enter two integers:");
    int c1 = scan.nextInt();
    int d1 = scan.nextInt();
    if(c1==d1/2)System.out.println("YES");
    
    System.out.println("Please enter an integers:");
    int e1 = scan.nextInt();
    if(e1%2==0)System.out.println("Divisible by 2!");
    if(e1%3==0)System.out.println("Divisible by 3!");
    
    System.out.println("Please enter an integers:");
    int f1 = scan.nextInt();
    if(e1%2==1)System.out.println("Odd");
    if(e1%2==0)System.out.println("Even");
    
    System.out.println("Please enter a letter grade:");
    String g1 = scan.next();
    switch (g1){
      case "A":
        System.out.println("90-100");
      break;
      case "B":
        System.out.println("80-90");
      break;
      case "C":
        System.out.println("70-80");
      break;
      case "D":
        System.out.println("60-70");
      break;
      case "F":
        System.out.println("0-60");
      break;
      default:
        System.out.println("Invalid letter grade");
    }
    
    int n=(int)(Math.random()*50+1);
    int s=(int)(Math.random()*100-50+1)+50;
    System.out.println(n+" + "+s+" = ?");
    System.out.print("> ");
    int h1 = scan.nextInt();
    if(h1!=n+s){
      System.out.println("Wrong");
    } else System.out.println("Correct!");
    
    System.out.println("What is the temperature?");
    int i1 = scan.nextInt();
    if(i1>=97 && i1<=99){
      System.out.println("Temperature is OK");
    } else System.out.println("NOT NORMAL");
    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
