public class mergesortjava{
    
    public static void print(int [] arr){
        int n=arr.length;
          for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void merge(int[] arr,int low,int mid,int high){
       int n1=mid-low+1;
       int n2=high-mid;
       int []arr1=new int[n1];
       int []arr2=new int[n2];
       
       for(int i=0;i<n1;i++){
           arr1[i]=arr[low+i];
          
       }
         for(int i=0;i<n2;i++){
           arr2[i]=arr[mid+1+i];
           
       }
         int  k=low;
        int i=0;
        int j=0;
       while(i<n1&&j<n2){
           if(arr1[i]<arr2[j])
                 arr[k++]=arr1[i++];
            else
                arr[k++]=arr2[j++];
           
       }
       while(i<n1){
           arr[k++]=arr1[i++];
       }
       
        while(j<n2){
            arr[k++]=arr2[j++];
        }
        
        
        
        
        
    } 
    public static void mergesort(int []arr,int low,int high){
        
        int mid=(low+high)/2;
        if(low>=high)
              return;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public  static void main(String[] args){
        int[] arr={12,1,34,25,56,45};
        int n=arr.length;
        System.out.println("Before sorting");
        print(arr);
         mergesort(arr,0,n-1);
        System.out.println("After sorting");
        print(arr);
    }
}
