public class Main {
    public static void main(String[] args) {
        Thread threadMyMain = new MyMain();
        //threadMyMain.setName("MAX PRIORITY");
        threadMyMain.start();

        MyRunnable myrunnable = new MyRunnable();
        Thread thread1 = new Thread(myrunnable);
        thread1.start();
        //thread1.setName("MIN PRIORITY");
    }
}
