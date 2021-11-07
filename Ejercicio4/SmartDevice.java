package es.Ejercicios.Ejercicio4;

public abstract class SmartDevice {
    private Double screen;
    private String battery;
    private Double weight;
    private Double height;
    private String color;
    private String brand;

    public SmartDevice(){

    }

    public SmartDevice(Double screen, String battery, Double weight, Double height, String color, String brand) {
        this.screen = screen;
        this.battery = battery;
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "screen='" + screen + '\'' +
                ", battery='" + battery + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Double getScreen() {
        return screen;
    }

    public void setScreen(Double screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
