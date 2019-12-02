public class bankData {

    private int billNumber;
    private int saveNumber;
    private int year;
    private persData pers1;
    bankData(int a, int b, int c){
        billNumber = a;
        saveNumber = b;
        year  = c;

    }
    public void setData(persData n){
        pers1 = n;
    }
    public synchronized int getBillNumber() {
        return billNumber;
    }

    public synchronized int getSaveNumber() {
        return saveNumber;
    }

    public int getYear() {
        return year;
    }
    public synchronized void getInfo(){
        System.out.println("bank"+this.saveNumber+"pers"+pers1.getNumber());
    }
    public synchronized  int returnInfo(){
        return(pers1.getNumber());
    }
}
