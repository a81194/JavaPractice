import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunIsPrime {

    public RunIsPrime() throws ExecutionException{
        Long previousTime = System.currentTimeMillis();

        MyRunnable myRunnable = new MyRunnable(20000);
        MyCallable myCallable = new MyCallable(20000);

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(myRunnable);
        Future<int[]> future = (Future<int[]>) service.submit(myCallable);

        try {
            System.out.println(Arrays.toString(future.get()));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        service.shutdown();
        Long currenTime = System.currentTimeMillis();

        System.out.println("Runtime is " + (currenTime - previousTime));
    }

    public static void main(String[] args) throws ExecutionException {
        new RunIsPrime();
    }
}
