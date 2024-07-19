import java.util.*;
public class ArraySum {
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        int size;
        System.out.println("Enter size of the array: ");
        size=r.nextInt();
        int arr[]=new int[size];
        int sum=0;
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=r.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println(("The summation is"+" "+sum));
    }
    
}
