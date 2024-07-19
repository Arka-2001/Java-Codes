import java.util.Scanner;
public class userinput {
    public static void main(String[] args)
    {
        System.out.println("Taking user input from user");
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number 1");
         int a=sc.nextInt();
         System.out.println("Enter number 2");
         int b=sc.nextInt();
         int sum=a+b;
         System.out.println("The sum of these numbers is: ");
         System.out.println(sum);
         System.out.println("Check whether false or true");
         boolean b1=sc.hasNext();
         System.out.println(b1);
        String str=sc.nextLine();
        System.out.println(str);

    }
}
