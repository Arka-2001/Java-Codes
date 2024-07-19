
import java.util.Scanner;

class Closest{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int val=x/y;

        int res1=val*y;
        int res2=(val+1)*y;

        int another1=x-res1;
        int another2=res2-x;

        if(another1<another2)
        {
            System.out.println(res1);
        }
        else{

            System.out.println(res2);
        }
        
    }
}