package MatrixAndVectorPackage;


public class ExecMatrAndVect {
    private static Matrix m;
    private static Vector v;

    ExecMatrAndVect(Matrix m, Vector v) {
        this.m = m;
        this.v = v;
    }

    public static void makeVectSum() {
        int k = 0;
        for (int i = 0; i < m.getRefMatr().length; i++) {
            v.getRefVect()[k++] = m.summaRow(i);
        }
    }

    static void showMatrVectSum() {
        System.out.println("Matrix and vector result: ");
        for (int i = 0; i < m.getRefMatr().length; i++) {
            System.out.println();
            for (int j = 0; j < m.getRefMatr()[i].length; j++)
                System.out.printf("%5d", m.getRefMatr()[i][j]);
            System.out.printf("\t\t %5d", v.getRefVect()[i]);
        }
        System.out.println();
    }

    private static int posMax(int format) {
        int max = m.getRefMatr()[0].length;
        for (int i = 1; i < m.getRefMatr().length; i++)
            if (m.getRefMatr()[i].length > max) max = m.getRefMatr()[i].length;

        return max * format;
    }

    private static void printSpaces(int k) {
        for (int i = 0; i < k; i++)
            System.out.print(" ");
    }

    static void showMatrVectIrregular() {
        int spacesMax = posMax(5);
        for (int i = 0; i < m.getRefMatr().length; i++) {
            System.out.println();
            for (int j = 0; j < m.getRefMatr()[i].length; j++) {
                System.out.printf("%5d", m.getRefMatr()[i][j]);
            }
            int k = spacesMax - m.getRefMatr()[i].length * 5;
            printSpaces(k);
            System.out.printf("%5d", v.getRefVect()[i]);
        }
    }

    public static void main(String[] args) {
        //Make regular matrix
        Matrix mr = new Matrix("Matrix regular", 9, 9, 15);
        Vector vr = new Vector("Result", mr.getRows());
        ExecMatrAndVect mvr = new ExecMatrAndVect(mr, vr);

        //showMatrVectSum();

        //Make irregular matrix
//        Matrix mr2 = new Matrix(11, 12, 12, "Irregular matrix");
//        Vector vr2 = new Vector("Result irregular matrix", mr2.getRows());
//        mr2.createMatrIrregular(10);
//        System.out.println();
//        System.out.println("Irregular matrix and vector result:");
//        MatrVect mvr2 = new MatrVect(mr2, vr2);
//        mvr2.makeVectSum();
//        mvr2.showMatrVectIrregular();

    }
}

