public class task4 {
    public static void main(String[] args){
        int n=100+(int)(Math.random()*666);
        System.out.println("Число - "+n);
        int sum=0;
        int c;
        c=n%10;
        sum=sum+c;
        n=n/10;
        c=n%10;
        sum=sum+c;
        n=n/10;
        sum=sum+n;

        System.out.println("Сумма - "+sum);
    }
}
