import java.util.List;
public class Coordenada {
    private Coord coord;
    private List<Weather> weather;
    private String name;
    private Main main;

    public Coord getCoord() {
        return coord;
    }
    public void setCoord(Coord coord) {
        this.coord = coord;
    }
    public List<Weather> getWeather() {
        return weather;
    }
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Main getMain() {
        return main;
    }
    public void setMain(Main main) {
        this.main = main;
    }
    public static class Coord {
        private double lon;
        private double lat;

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        @Override
        public String toString() {
            return String.format("Longitude: %.4f, Latitude: %.4f", lon, lat);
        }
    }

    public static class Weather {
        private String description;

        // Getter e setter
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return String.format("Descrição do tempo: %s", description);
        }
    }

    public static class Main {
        private double temp;
        private int humidity;

        // Getters e setters
        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }
        public double getTempCelsius() {
            return temp - 273.15;
        }

        @Override
        public String toString() {
            return String.format("Temperatura: %.2f °C, Umidade: %d%%", getTempCelsius(), humidity);
        }
    }

    @Override
    public String toString() {
        return String.format("Localização: %s\nCoordenadas: %s\n%s\n%s",
                name, coord, weather.isEmpty() ? "Descrição do tempo não disponível" : weather.get(0),
                main);
    }
}
