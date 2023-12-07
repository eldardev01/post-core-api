package homework9;

import java.util.Objects;

public class Temperature {
    private double temperature;
    private String scale;

    public Temperature(String scale) {
        this.scale = scale;
        this.temperature = 0.0;
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = "C";
    }

    public Temperature(double temperature, String scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public Temperature() {
        this.scale = "C";
        this.temperature = 0.0;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setScaleAndTemperature(double temperature, String scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public String getScaleF() {
        return scale = "F";
    }

    public String getScaleC() {
        return scale = "C";
    }

    public double getDegreesF(double temperature) {
        return (9 * (temperature / 5) + 32);
    }
    public double getDegreesC(double temperature) {
        return ((5 * (temperature - 32)) / 9);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(temperature, that.temperature) == 0 && Objects.equals(scale, that.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, scale);
    }

    public String toString() {
        String scale = getScale();
        String str = "";
        if (scale.equals("C")) {
            str = "Температура по цельсию = " + temperature + " " + scale + "\n" +
                    "Температура по фаренгейту = " + getDegreesF(this.temperature) + " " +  getScaleF();
        } else {
            str = "Температура по фаренгейту= " + temperature + " " + scale + "\n" +
                    "Температура по по цельсию = " + getDegreesC(this.temperature) + " " + getScaleC();
        }
        return str;
    }


}
