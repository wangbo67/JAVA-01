package javacourse.concurrent.task.week0401;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @program: java-course
 * @description: 思考有多少种方式，在 main 函数启动一个新线程，运行一个方法，拿到这个方法的返回值后，退出主线程？
 * @author: wangbo67@github.com
 * @created: 2021-02-07 00:45
 **/
public class HomeWork {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // 创建一个线程或线程池
        // 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 异步执行方法并获取返回值
                int result = sum();
                System.out.println("thread1 异步计算结果为：" + result);
            }
        });
        thread1.start();

        // 2
        Thread thread2 = new Thread(() -> {
            // 异步执行方法并获取返回值
            int result = sum();
            System.out.println("thread2 异步计算结果为：" + result);
        });
        thread2.start();

        // 3
        Thread thread3 = new Thread(new Handler1());
        thread3.start();

        // 4
        Handler2 handler2 = new Handler2();
        handler2.start();

        // 5
        Thread thread4 = new Thread(new Handler2());
        thread4.start();

        // 6
        FutureTask futureTask = new FutureTask(new Handler3());
        new Thread(futureTask).start();

        // 7
        Callable call = HomeWork::sum;
        try {
            System.out.println("7 异步计算结果为：" + call.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 8
        ExecutorService executorService1 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Future<Integer> result = executorService1.submit(new Handler3());
        try {
            System.out.println("8 异步计算结果为：" + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService1.shutdownNow();

        // 9
        ExecutorService executorService2 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executorService2.execute(new Handler1());
        executorService2.shutdownNow();

        // 10
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(new Handler1());
        try {
            System.out.println(completableFuture1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // 11
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(new Supplier1());
        try {
            System.out.println(completableFuture2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // 12
        ExecutorService executorService3 = Executors.newFixedThreadPool(2);
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService3);
        completionService.submit(HomeWork::sum);
        try {
            System.out.println(completionService.take().get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService3.shutdownNow();
        }

        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2) {
            return 1;
        }
        return fibo(a - 1) + fibo(a - 2);
    }

    static class Handler1 implements Runnable {

        @Override
        public void run() {
            // 异步执行方法并获取返回值
            int result = sum();
            System.out.println("Handler1 异步计算结果为：" + result);
        }
    }

    static class Handler2 extends Thread {
        public void run() {
            // 异步执行方法并获取返回值
            int result = sum();
            System.out.println("Handler2 异步计算结果为：" + result);
        }
    }

    static class Handler3 implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            // 异步执行方法并获取返回值
            int result = sum();
            System.out.println("Handler3 异步计算结果为：" + result);
            return result;
        }
    }

    static class Supplier1 implements Supplier {
        @Override
        public Object get() {
            // 异步执行方法并获取返回值
            int result = sum();
            System.out.println("Supplier1 异步计算结果为：" + result);
            return result;
        }
    }
}
