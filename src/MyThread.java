public class MyThread extends Thread {

    @Override
    public void run () {

        if(this.isDaemon()) {
            System.out.println("This is a daemon thread that is running");
        }
        else {
            System.out.println("This is a user thread that is running");
        }

        for(int i =10; i >0; i--) {
            System.out.println("Thread #1 :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 is finished");
    }


}
