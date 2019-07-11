package Chicken;


public class Solution {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen("Belarus");
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());


    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Belarus")) {
                return new BelarusianHen();
            } else if (country.equals("Ukraine")) {
                return new UkraineanHen();
            } else if (country.equals("Russia")) {
                return new RussianHen();
            } else if (country.equals("Moldova")) {
                return new MoldovanHen();
            } else
                return hen;

        }
    }
}




