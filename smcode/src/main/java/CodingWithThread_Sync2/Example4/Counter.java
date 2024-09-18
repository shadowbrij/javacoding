package CodingWithThread_Sync2.Example4;

public class Counter {
    private int value = 0;

    public int getValue(){
        return value;
    }

    public synchronized void incValue(int offset){
        this.value += offset;
    }
}
