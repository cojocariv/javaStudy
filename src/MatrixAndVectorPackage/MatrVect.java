//package MatrixAndVectorPackage;
//
//public class MatrVect {
//    private Matrix m;
//    private Vector v;
//    MatrVect(Matrix matr, Vector vect){
//        m = matr;
//        v = vect;
//    }
//
//    void makeVectSum(){
//        int k = 0;
//        for(int i = 0; i < m.getRefMatr().length; i++){
//            v.getRefVect()[k++] = m.summaRow(i);
//        }
//    }
//    void showMatrVectSum(){
//        System.out.println("Matrix and vector result: ");
//        for(int i = 0; i < m.getRefMatr().length; i++){
//            System.out.println();
//            for (int j = 0; j < m.getRefMatr()[i].length; j++)
//                System.out.printf("%5d", m.getRefMatr()[i][j]);
//            System.out.printf("\t\t %5d", v.getRefVect()[i]);
//        }
//        System.out.println();
//    }
//    //Method that return numbers of position in max length row
//    private int posMax(int format){
//        int max = m.getRefMatr()[0].length;
//        for(int i = 1; i < m.getRefMatr().length; i++)
//            if(m.getRefMatr()[i].length > max) max = m.getRefMatr()[i].length;
//
//        return max * format;
//    }
//    //Method that print spaces
//    private void printSpaces(int k){
//        for(int i = 0; i < k; i++)
//            System.out.print(" ");
//    }
//    //show irregular matrix and vector
//    void showMatrVectIrregular(){
//        int spacesMax = posMax(5);
//        for(int i = 0; i < m.getRefMatr().length; i++){
//            System.out.println();
//            for(int j = 0; j < m.getRefMatr()[i].length; j++){
//                System.out.printf("%5d", m.getRefMatr()[i][j]);
//            }
//            int k = spacesMax - m.getRefMatr()[i].length * 5;
//            printSpaces(k);
//            System.out.printf("%5d", v.getRefVect()[i]);
//        }
//    }
//}







