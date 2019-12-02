public class persData {
    private int serial;
    private int number;
    private int year;
    private bankData bank1;
    persData(int a, int b, int c){
        serial = a;
        number = b;
        year = c;
    }
    public synchronized int getSerial() {
        return serial;
    }

    public void setData(bankData n){
        bank1 = n;
    }

    public synchronized int getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public synchronized void getInfo(){
        System.out.println("Pers"+this.number+"bank"+bank1.getBillNumber());
    }
    public synchronized  int returnInfo(){

        return(bank1.getBillNumber());
    }
}
