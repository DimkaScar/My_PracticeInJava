package Algorythms;

public class DRoot {
    public static int digital_root(int n) {

        int sum=0;
        int sum1=0;

        if(n>0 && n<10){
            sum = n;
        }
        else if(n>=10){
            do {
                while(n>=10){
                    sum+=n%10;
                    n=n/10;
                    if(n>0 && n<10){
                        sum += n;
                    }
                }
                sum1 =0;
                sum1+=sum%10;
                sum=sum/10;
                if(sum>0 && sum<10){
                    sum1 += sum;
                }
                sum =sum1;
            }while(sum>=10);
        }
        System.out.println("Sum = " + sum);
        return sum;
    }
}
