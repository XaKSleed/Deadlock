public class Main {

    public static void main(String[] args) {

       bankData bank1 = new bankData(2488,2233,2020 );
       persData pers1 = new persData(7613,694715,1999);
       bank1.setData(pers1);
       pers1.setData(bank1);
       Thread thread1 = new Thread(new MyThread1(pers1));
       Thread thread2 = new Thread(new MyThread2(bank1));

       thread1.start();
       System.out.println("first run");

       thread2.start();
       System.out.println("second run");
    }
}

