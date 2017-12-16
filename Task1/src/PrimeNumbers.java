import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static List<Integer> CalcPrimeNumber(int n){
        boolean[] IsPrimeNumber=new boolean[n+1];
        List<Integer> Primes=new ArrayList<Integer>();
        for (int i=2;i<n;i++){
            IsPrimeNumber[i]=true;
        }
        for (int i=2;i<n;i++){
            if (IsPrimeNumber[i]){
                Primes.add(i);
                for (int j=i;j*i<=n;j++){
                    IsPrimeNumber[i*j]=false;
                }

            }
        }
        return Primes;
    }
    public static void main(String[]args){
        System.out.println(CalcPrimeNumber(30));
    }




}