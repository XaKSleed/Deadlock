public class MyThread2 implements Runnable {

    private bankData bank1;

    MyThread2(bankData first){
        bank1 = first;
    }
    public void run(){

        for(int i = 0; i < 50; i++){
            bank1.getInfo();
        }


    }

}

