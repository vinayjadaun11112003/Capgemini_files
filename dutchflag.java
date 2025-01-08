import java.util.*;
 class dutchflag {
    public static int[] solve(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                int t=arr[mid];
                arr[mid]=arr[low];
                arr[low]=t;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int t=arr[mid];
                arr[mid]=arr[high];
                arr[high]=t;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println("hello world");
        int[] arr = new int[]{1,0,2,1,0,2,1,0,2,2,0,1,0};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
