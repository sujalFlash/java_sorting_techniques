public class main{
    
    public static void print(int [] arr){
        int n=arr.length;
          for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public  static void main(String[] args){
        int[] arr={12,1,34,25,56,45};
        int n=arr.length;
        System.out.println("After sorting");
        print(arr);
        for(int i=0;i<=n-1;i++){
             int j=i;
             while(j>0&&arr[j-1]>arr[j]){
                 int t=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=t;
                 j--;
             }
        }
        System.out.println("Before sorting");
        print(arr);
    }
    
    
    
    
    
}
