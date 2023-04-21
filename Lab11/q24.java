public class q24{
    public static void main(String[] args){
        Thread t = new Thread(new myRunnable());
        t.setDaemon(true);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread: "+i);
        }
    }
    private static class myRunnable implements Runnable{
        @Override
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println("Daemon thread: "+i);
            }
        }
    }
}
