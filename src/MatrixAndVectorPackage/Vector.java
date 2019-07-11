package MatrixAndVectorPackage;

public class Vector {
    private String name;
    private int size; //Numbers of elements;
    private int[] refVect; //Link on array of values;

    public int[] getRefVect() {
        return refVect;
    }

    //Constructor for class Vector
    Vector(String nameVect, int sizeVect) {
        name = nameVect;
        size = sizeVect;
        refVect = new int[size];
    }

    //Show vector
    void showVector() {
        System.out.println(name);
        for (int i = 0; i < refVect.length; i++) {
            System.out.print("  " + refVect[i]);
        }
        System.out.println("\n");
    }
}

