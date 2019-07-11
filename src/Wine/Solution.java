package Wine;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
//        System.out.println(getWine().taste());
        //System.out.println(getBubblyWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
