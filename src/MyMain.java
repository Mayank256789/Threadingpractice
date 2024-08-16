public class MyMain extends Thread {
    int [] number1 = {1,2,3,4,5,6,7,8,9,10};
    int i = 0;
    public void run() {
        for (int i = 0; i<number1.length; i++){
            if (number1[i]%2 ==0) {
                System.out.println("This is an even number" + number1[i]);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}