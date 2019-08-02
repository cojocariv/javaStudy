package CloneTemp;

import java.io.Serializable;

public class BigObject implements Serializable {
    private int a1;
    private int a2;

    public BigObject(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }
}
