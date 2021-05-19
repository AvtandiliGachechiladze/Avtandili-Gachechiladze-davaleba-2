package ge.edu.btu.Avtandili_Gachechiladze_davaleba_2.Avtandili_Gachechiladze_weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherApp {
    public static List<Weather> weatherList = new ArrayList<>();

    public static void fillWeatherList(){
        weatherList.add(new Weather("Tbilisi", 24,
                15, 10, Weather.DirectionType.EAST, 11));
        weatherList.add(new Weather("Kutaisi", 23,
                15, 10, Weather.DirectionType.WEST, 12));
        weatherList.add(new Weather("Batumi", 22,
                15, 10, Weather.DirectionType.NORTH, 13));
        weatherList.add(new Weather("Zugdidi", 21,
                15, 10, Weather.DirectionType.SOUTH, 14));

    }

    public static List<Weather> getWeather() {
        fillWeatherList();

        return weatherList;
    }

    public static Weather getStudent(String cityName) {

        fillWeatherList();

        Weather weatherToReturn = new Weather();
        for (Weather weather : weatherList) {
            if (cityName.equals(weather.CityName)) {
                weatherToReturn = weather;
            }
        }

        return weatherToReturn;
    }
}
