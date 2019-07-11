package DemoPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    private Pattern pattern, pattern2;
    private Matcher m;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_.-]+@[a-zA-A0-9-]+\\.[a-zA-Z0-9-.]+$";
    private static final String IP_PATTERN = "^((01)?\\d\\d?|2(0-4))$";

    public Demo() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    boolean checkEmail(String email) {
        m = pattern.matcher(email);
            if (m.matches()) {
                System.out.println("Ati introdus email corect ");
            } else {
                System.out.println("Mai incercati odata");
            }
            return m.matches();
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.checkEmail("cojocari.v@mail.ru"));
    }


}
