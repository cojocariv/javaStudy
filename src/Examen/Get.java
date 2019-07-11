package Examen;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Get {
    private static String buf; //buffer
    private static int valueInt; // correct int
    private static double valueDouble; // correct double
    private static BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    //methods for intern uses

    private static void showBoxError(String error){
        JOptionPane.showMessageDialog(null,error,"Error!!!",JOptionPane.ERROR_MESSAGE);
    }// end of method showBoxError

    public static void error(String msg){
        String diagnosis = "[ "+buf+" ]"+msg+".";
        showBoxError(diagnosis);
        System.out.println("Repeat the enter: ");
    } // end of method error

    private static void error(String msg, int min, int max){
        String diagnosis = (msg+" ["+min+","+max+"].");
        showBoxError(diagnosis);
        System.out.println("Repeat the enter: ");
    } // end of method error2

    private static void error(String msg, double min, double max){
        String diagnosis = (msg+" ["+min+","+max+"].");
        showBoxError(diagnosis);
        System.out.println("Repeat the enter: ");
    } // end of method error3

    private static void read(){
        do{
            try{
                buf= br.readLine().trim();
            }catch(IOException e){
                error("input channel failures");
            } if(buf.length()!=0)break;
            error("-the buffer is empty");
        }while(true);
    } // end of method read
    //method for uses

    /*public static String name(int minLength, int maxLength) throws IOException{
        while(true){
                buf = br.readLine().trim();
           if(buf.length() <= minLength && buf.length() >= maxLength){
               break;
            }else{
             error("the buffer length is not in the range");
             continue;
            }

        }
        return buf;
    }
    */

    public static int Int(){
        while(true){
            try{
                read();
                valueInt = Integer.parseInt(buf);
            }catch(NumberFormatException e){
                error("-this is not integer type");
                continue;
            }
            return valueInt;
        }

    } // end of method Int

    public static int Int(int min, int max){
        while(true){
            valueInt=Int();
            if(valueInt>=min && valueInt<=max) break;
            error("The value is not in the range", min, max);
            continue;
        }
        return valueInt;
    }// end of method Int2

    public static double Double(){
        while(true){
            try{
                read();
                valueDouble = Double.parseDouble(buf);
            }catch(NumberFormatException e){
                error("-this is not double type");
                continue;
            }
            return valueDouble;
        }
    } // end of class Double

    public static double Double(double min, double max){
        while(true){
            valueDouble=Double();
            if(valueDouble>=min && valueDouble<=max) break;
            error("The value is not in the range", min, max);
            continue;
        }
        return valueDouble;
    }// end of method Int2

    public static int [] ArrayInt(int [] arrInt){
        System.out.println("Choose the length of array: ");
        valueInt=Int();
        arrInt= new int[valueInt];
        System.out.println("Input "+valueInt+" elements in the array :  ");
        for(int i=0;i<valueInt;i++){
            System.out.print("\nelement - "+i+":");
            arrInt[i]=Int();
        }
        return arrInt;
    }
}
