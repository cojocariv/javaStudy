package Ringaci;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 27.03.19
 * Time: 8:06
 * To change this template use File | Settings | File Templates.
 */
public class ExecParametersMethods {
    public static void main(String[] args){
        ValueInt p = new ValueInt("P", 8);
        ValueInt g = p.addValue(4);
        //System.out.println(p + " " + g);
        ValueInt f = p.fieldsSumObjects(p,g);
       // System.out.println(f);
       System.out.println(p + " " + g);
    }
}
