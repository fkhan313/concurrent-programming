import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        /*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */


        Instant instant = Instant.now();

        //Thread.currentThread().setName("MAIN");
        System.out.println("The name of current thread is " + Thread.currentThread().getName());

        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());
    	/*
    	for(int i =3;i>0;i--) {
    		System.out.println(i);
    		Thread.sleep(1000);
    	}

    	*/

        //creating Thread using a subclass of the Thread class

        MyThread thread1 = new MyThread();
        System.out.println("The name of thread1 is: "+ thread1.getName());
        thread1.setDaemon(false);
        System.out.println("thread1 Daemon status: " +thread1.isDaemon());
        thread1.start(); //thread will not start unless this method is used
        System.out.println("thread1 alive status: " +thread1.isAlive());
        System.out.println("The number of active thread at: " +instant +" is :" +Thread.activeCount());

        //creating thread using a class that implements the Runnable interface

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread2.start(); //start thread2
        System.out.println("The number of active thread at: " +instant +" is :" +Thread.activeCount());


    }
}