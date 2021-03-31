package com.example.thread;

import lombok.SneakyThrows;

public class ThreadLocalExample implements Runnable{
    private static final ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 10);
    private int value = 10;

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj =new ThreadLocalExample();
        for(int i=0;i<10;i++){
            Thread thread=new Thread(obj);
            Thread.sleep(1000);
            thread.start();
        }
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Thread name = "+ Thread.currentThread().getName()+" default threadLocal = " + threadLocal.get().toString());
        System.out.println("Thread name = "+ Thread.currentThread().getName()+" default value = " + value);
        Thread.sleep(1000);
        threadLocal.set(20);
        value=20;
        System.out.println("Thread name = "+ Thread.currentThread().getName()+" update threadLocal = " + threadLocal.get().toString());
        System.out.println("Thread name = "+ Thread.currentThread().getName()+" update value = " + value);

    }
}
