package Weather;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 26.03.19
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather{
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String getWeatherType() {
            return type;
        }
        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }


    }
}
