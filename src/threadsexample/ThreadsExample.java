/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexample;

/**
 *
 * @author Baxi
 */
public class ThreadsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores :" + cores);
        
        //1 Creating and Starting Threads
        Thread simpleThread = new Thread();
        simpleThread.setName("#1 Simple Thread");
        simpleThread.start();
        System.out.println(simpleThread.getName());
        
        //2 Thread Subclass
        ExtendsThread myThread = new ExtendsThread();
        myThread.start();
        
        //3 Anonymous subclass of Thread
        Thread anonymousSubclass;
        anonymousSubclass = new Thread() {
            @Override
            public void run() {
                System.out.println("#3 Anonymous subclass thread");
            }
        };
        anonymousSubclass.start();
        
        //4 Class implements Runnable
        ImplementsRunnable threadRunnable = new ImplementsRunnable();
        threadRunnable.run();
        
        //5 Anonymous Implementation of Runnable
        Runnable myRunnable
                = new Runnable() {
            @Override
            public void run() {
                System.out.println("#5 Anonymous implementation of runnable");
            }
        };
        myRunnable.run();
        
        //6 Lambda Runnable
        Runnable runnable
                = () -> {
                    System.out.println("#6 Lambda Runnable");
                };
        runnable.run();
        
        
        
    }
    
}
