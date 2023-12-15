package pruebas;

public class Main {
    public static void main(String[] args) {
        String lat, lon, apiKey, url;

        apiKey = "834c5fc4770d0beb4ac7bf206ded86a1";

        // Campana
        lat = "-34.16327";
        lon = "-58.95919";
        url = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+apiKey+"&units=metric&lang=es";

        System.out.println(url);
    }
}
