package MatrixAndVectorPackage;


import java.util.Random;

public class Matrix {
    private String name;
    private int rows, columns;
    private static int[][] refMatr;

    public int getRows() {
        return rows;
    }

    public int[][] getRefMatr(){
        return refMatr;
    }

    //Constructor regular matrix
    Matrix(String nameMatr, int maxRows, int maxColumns, int maxValue) {
        name = nameMatr;
        Random r = new Random();
        rows = r.nextInt(maxRows) + 1;
        columns = r.nextInt(maxColumns) + 1;
        refMatr = createMatrRegular(maxValue);
    }

    //Constructor irregular matrix
    Matrix(int maxRows, int maxColumns, int maxValue, String nameMatr) {
        name = nameMatr;
        Random r = new Random();
        rows = r.nextInt(maxRows) + 1;
        columns = r.nextInt(maxColumns) + 1;
        refMatr = createMatrIrregular(maxValue);
    }

    //Method1
    int[][] createMatrRegular(int valueRand) {

        int[][] ref = new int[rows][columns];
        int value;
        Random r = new Random();
        for (int i = 0; i < ref.length; i++)
            for (int j = 0; j < ref[i].length; j++) {
                value = r.nextInt(valueRand);
                ref[i][j] = r.nextBoolean() ? value : -value;
            }
        return ref;

    }

    //Method2
    int[][] createMatrIrregular(int valueRand) {

        int[][] ref = new int[rows][];
        int value;
        //Create irregular array
        Random r = new Random();
        for (int i = 0; i < ref.length; i++) {
            ref[i] = new int[r.nextInt(columns) + 1];

        }
        //Initiate values
        for (int i = 0; i < ref.length; i++)
            for (int j = 0; j < ref[i].length; j++) {
                value = r.nextInt(valueRand);
                ref[i][j] = r.nextBoolean() ? value : -value;
            }
        return ref;
    }

    //Summa elementov i-oi stroki matrity
    int summaRow(int i) {

        int s = 0;
        for (int j = 0; j < refMatr[i].length; j++) {
            s += refMatr[i][j];
        }
        return s;
    }

    //Show matrix
    void showMatrix() {

        System.out.println(name);
        System.out.println("rows=  " + rows + "  " + " columns=  " + columns);
        for (int i = 0; i < refMatr.length; i++) {
            System.out.println();
            for (int j = 0; j < refMatr[i].length; j++)
                System.out.printf("%5d", refMatr[i][j]);
        }
        System.out.println("\n");
    }
}

