public class MyThread1 implements Runnable {

   private persData pers1;

   MyThread1(persData first){
       pers1 = first;
   }
    public void run(){

        for(int i = 0; i < 50; i++){
            pers1.getInfo();

        }

    }

}
