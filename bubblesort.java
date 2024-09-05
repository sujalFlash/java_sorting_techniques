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
        System.out.println("before sorting");
        print(arr);
        boolean flag=false;
      for(int i=0;i<n-1;i++){
          flag=false;
          for(int j=0;j<n-1-i;j++){
              if(arr[j]>arr[j+1]){
                  int t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
                  flag=true;
              }
          }
          if(!flag)
                break;
      }
        System.out.println("after sorting");
        print(arr);
    }
}
