package aysncProg;

import java.util.EnumSet;
import java.util.concurrent.CompletableFuture;

public class Sample {
    private static int compute(){
        System.out.println("Compute" + Thread.currentThread());
        return 2;
    }
    public static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync(() -> compute());
    }

    private static void printIt(int value){
        System.out.println("print" + Thread.currentThread());
        System.out.println(value);
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main" + Thread.currentThread());

        //Thread.sleep(10000);
         create().thenAccept(data -> printIt(data));
        //Thread.sleep(10000);
        //completableFuture.thenAccept(data -> printIt(data));

        if("Welcome".trim() == "Welcome".trim()){
            System.out.println("eq");
        }
    }
}
