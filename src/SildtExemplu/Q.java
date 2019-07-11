package SildtExemplu;

public class Q implements Cloneable{
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet)
            try {
                Thread.sleep(1000);
                wait();
            }catch (InterruptedException e){
                System.out.println("Exeptia de tipul InterruptedException a fost activata");
            }
        System.out.println("Primit: " + n);
            valueSet = false;
            notify();
        return n;
    }
    synchronized void put(int n){
        while (valueSet)
            try {
                Thread.sleep(1000);
                wait();
            }catch (InterruptedException e){
                System.out.println("Exeptia de tipul InterruptedException a fost activata");
            }
        this.n = n;
            valueSet = true;
        System.out.println("Trimis: " + n);
        notify();
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
