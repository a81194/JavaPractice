import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<int[]> {

    int maxValue=0;

    public MyCallable(int maxValue){
        this.maxValue=maxValue;
    }
    @Override
    public int[] call() throws Exception {
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
        return prime;
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
