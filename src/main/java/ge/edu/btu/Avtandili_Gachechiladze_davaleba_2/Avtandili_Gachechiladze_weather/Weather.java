package ge.edu.btu.Avtandili_Gachechiladze_davaleba_2.Avtandili_Gachechiladze_weather;

public class Weather {
    public enum DirectionType{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    String  CityName;
    double Temperature;
    double Humidity;
    double Pressure;
    DirectionType WindDirection;
    double WindSpeed;

    public Weather(){

    }

    public Weather(String cityName, double temperature, double humidity,
                   double pressure, DirectionType windDirection, double windSpeed){
        CityName = cityName;
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
        WindDirection = windDirection;
        WindSpeed = windSpeed;
    }
}
