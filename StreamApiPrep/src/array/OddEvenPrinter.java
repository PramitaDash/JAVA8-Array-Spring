package array;

public class OddEvenPrinter {

    private int count = 1;
    private final int N;

    public OddEvenPrinter(int N){
        this.N = N;
    }

    public void printOdd(){
        synchronized (this){
            while(count <= N){
                if(count %2 == 1){
                    System.out.println("odd: "+count);
                    count++;
                    notify();
                }else{
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            notify();
        }
    }
    public void printEven(){
        synchronized (this){
            while(count<=N){
                if(count %2 ==0){
                    System.out.println("Even: " + count);
                    count++;
                    notify();
                }else{
                    try{
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            notify();
        }
    }

    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter(10);
        Thread oddThread = new Thread(()->printer.printOdd());
        Thread evenThread = new Thread(()->printer.printEven());
        oddThread.start();
        evenThread.start();
    }
}
