public class DutchPrblm {
    public static void main(String[] args) {
        int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int i;
        int n=arr.length;
        int s[]=new int[20];
        int a=s.length;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            s[i]=arr[i];
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
            s[i]=arr[i];
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==2)
            s[i]=arr[i];
        }
       System.out.println("The sorted array is: ");
       for(i=0;i<a;i++)
       {
        System.out.print(s[i]+ " ");
       }
       

    }
    
}
