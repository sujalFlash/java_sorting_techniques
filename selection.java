public class selection{
    
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
        System.out.println("Before sorting");
        print(arr);
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            if(i!=min)
                 {
                     int t=arr[min];
                     arr[min]=arr[i];
                     arr[i]=t;
                 }
        }
        System.out.println("After sorting");
        print(arr);
    }
}
