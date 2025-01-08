public class first{
    public static int digitsum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
    public static int func(int a){
        int sum=digitsum(a);
        while(sum>9){
           sum= digitsum(a);
        }
        return sum;

    }
    public static void main(String[] arr){
        int a = 20;
        System.out.println(func(a));
    }
}