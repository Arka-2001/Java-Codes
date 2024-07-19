import java.util.Scanner;
public class AppendString {
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the source string: ");
        str1=r.nextLine();
        System.out.println("Enter the destination string: ");
        str2=r.nextLine();
        int i=0,j=0;
        char str3[]=new char[str1.length()+str2.length()];
        for(i=0;i<str1.length();i++)
        {
            str3[j]=str1.charAt(i);
            j++;
        }
        for(i=0;i<str2.length();i++)
        {
            str3[j]=str2.charAt(i);
            j++;
        }
        System.out.println("The string after appned");
        for(i=0;i<str3.length;i++)
        {
            System.out.print(str3[i]);
        }

    }
    
}
