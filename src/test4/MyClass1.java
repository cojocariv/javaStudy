package test4;

public class MyClass1 {
    public static void main(String[] args) {

        String msg = "msg = ";
        int k = 256;
        for (int i = 0; i < args.length; i++) {
            try {
                k = Integer.parseInt(args[i]);
                msg += k;
                System.out.println(msg);
            } catch (Exception e) {
                msg += k;
                System.out.println(msg);
            }
        }

    }


}
