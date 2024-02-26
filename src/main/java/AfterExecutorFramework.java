import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AfterExecutorFramework {

    public static void main(String[] args) {
        List<Runnable> tasks = Arrays.asList(
                () -> performTask("Task 1"),
                () -> performTask("Task 2"),
                () -> performTask("Task 3")
        );

        // Using Executor framework (ThreadPool)
        ExecutorService executorService = Executors.newFixedThreadPool(tasks.size());

        for (Runnable task : tasks) {
            executorService.submit( task);
        }


        // Shutting down the executor service
        executorService.shutdown();
    }

    private static void performTask(String taskName) {
        System.out.println("Executing " + taskName + " on thread " + Thread.currentThread().getName());
        // Simulate some task execution
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + taskName);
    }
}
