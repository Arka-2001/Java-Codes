import java.util.ArrayDeque;
import java.util.Deque;

public class abc {
    public static void main(String[] args) {
        int a=n/2;
        int c=1;
        int maximum_times=0;
     for(int i=0;i<n;i++)
     {
    c=1;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                c++;
                if(c>a){
                    |maximum_times=Math.max(maximum_times,c);

                }
            }
             
        }

     }
    }
    
}
