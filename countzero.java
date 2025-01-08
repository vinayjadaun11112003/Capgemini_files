import java.util.*;

class countzero {
    public static int[] solve(int[] arr){
        int high=arr.length-1;
        int end=arr.length-1;
        while(end>0){
             if(arr[end]==0){
                end--;
             }else if(arr[end]!=0){
                int t=arr[high];
                arr[high]=arr[end];
                arr[end]=t;
                high--;end--;
             }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{0,5,0,5,8,5,10,7,0,0,0,0,0,};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
