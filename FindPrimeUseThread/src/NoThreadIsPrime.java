import java.util.ArrayList;
import java.util.Arrays;

public class NoThreadIsPrime {

    int maxValue=20000;
    public NoThreadIsPrime(){
        Long previousTime = System.currentTimeMillis();

        getPrime();
        getPrime();

        Long currenTime = System.currentTimeMillis();
        System.out.println("Runtime is " + (currenTime - previousTime));
    }

    public void getPrime(){
        ArrayList<Integer> primes=new ArrayList<Integer>();
        for (int i = 2; i < maxValue; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        int[] prime=new int[primes.size()];
        for (int i=0;i<prime.length;i++){
            prime[i]=primes.get(i);
        }
        System.out.println(Arrays.toString(prime));
    }

    private boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new NoThreadIsPrime();
    }
}
