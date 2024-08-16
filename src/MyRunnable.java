public class MyRunnable implements Runnable {
    int [] number2 = {1,2,3,4,5,6,7,8,9,10};
    int j = 0;
    public void run() {
        for (int j = 0; j < number2.length; j++) {
            if(number2[j] % 2 != 0) {
                System.out.println("This is odd number" + number2[j]);
            }
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




