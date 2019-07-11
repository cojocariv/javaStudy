package DotCom;

import java.util.ArrayList;

public class DotCom {
    public static void main(String[] args) {
                DotCom newdot = new DotCom();
        newdot.checkYourself("sdf");
    }
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Mimo";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Potopil";
            } else {
                result = "popal";
            }
        }
        return result;
    }
}
