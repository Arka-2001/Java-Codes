import java.util.Scanner;

public class Arrayuser {
    public static void main(String[] args)
    {
        int i,size;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size=r.nextInt();
        int marks[]=new int[size];
        for(i=0;i<size;i++)
        {
            marks[i]=r.nextInt();
        }
        System.out.println(marks[i]);
        for(i=0;i<size;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
