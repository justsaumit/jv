public class DaemonThreadDemo {

    public static void main(String[] args) {
        // Create a new thread
        Thread t = new Thread(new MyRunnable());

        // Set the thread as a daemon thread
        t.setDaemon(true);

        // Start the thread
        t.start();

        // Main thread execution
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread: " + i);
        }
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Daemon thread execution
            for (int i = 0; i < 1000; i++) {
                System.out.println("Daemon thread: " + i);
            }
        }
    }
}
