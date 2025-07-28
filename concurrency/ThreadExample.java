package concurrency;

import java.util.concurrent.CompletableFuture;

public class ThreadExample extends Thread{
    public void run()
    {

    }

    public static void main(String[] args)
    {
        // Create multiple CompletableFutures for tasks without a return value
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
//            Thread 1 code runs here
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
//            Thread 2 code runs here
        });

        // Wait for all futures to complete
        CompletableFuture.allOf(future1, future2).join();
    }
}
