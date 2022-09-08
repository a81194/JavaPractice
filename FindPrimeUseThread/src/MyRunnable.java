import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyRunnable implements Runnable {

    int maxValue = 0;

    public MyRunnable(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public void run() {
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
}
