class sum_largest
{
    public static void main(String args[])
    {
        int[] arr = {10,51,53,39,47,44,21};
        int n=arr.length;
        for(int i=0;i<n;i++){
               for(int j=i;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.print("Sum of 2nd and 3rd largest number : ");
        System.out.println(arr[n-2]+arr[n-3]);
    }
}