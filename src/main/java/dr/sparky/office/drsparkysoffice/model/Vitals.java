package dr.sparky.office.drsparkysoffice.model;

import java.io.Serializable;

public class Vitals implements Serializable {

    private int weight;
    private double height;
    private double temperature;
    private String bloodPressure;

    public Vitals(int weight, double height, double temperature, String bloodPressure) {
        this.weight = weight;
        this.height = height;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "Vitals{" +
                "weight=" + weight +
                ", height=" + height +
                ", temperature=" + temperature +
                ", bloodPressure='" + bloodPressure + '\'' +
                '}';
    }
}
