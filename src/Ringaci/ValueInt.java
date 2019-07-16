package Ringaci;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 27.03.19
 * Time: 8:05
 * To change this template use File | Settings | File Templates.
 */
public class ValueInt {
    private String name;
    private int x;

    public ValueInt(String myName, int value){
        name = myName;
        x = value;
    }
    public ValueInt(){
        name = "com/javarush/task/task23/task2309";
        x = 0;
    }
    public ValueInt addValue(int val){
        ValueInt temp = new ValueInt();
        temp.x = x;
        temp.x+=val;
        return temp;
    }
    public ValueInt fieldsSumObjects(ValueInt a, ValueInt b){
        ValueInt temp = new ValueInt();
        temp.x = a.x + b.x;
//       a.x = -1;
//       b.x = -1;
        return temp;
    }
    public String toString(){
        return "Object" + ": " + name + "      " + "x= " + x + "\n";
    }
}
