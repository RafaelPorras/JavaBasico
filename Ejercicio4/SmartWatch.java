package es.Ejercicios.Ejercicio4;


public class SmartWatch extends SmartDevice {
    private String strap;
    private String compatibility;

    public SmartWatch(){}

    public SmartWatch(Double screen, String battery, Double weight, Double height, String color, String brand, String strap, String compatibility) {
        super(screen, battery, weight, height, color, brand);
        this.strap = strap;
        this.compatibility = compatibility;
    }

    public String getStrap() {
        return strap;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    @Override
    public String toString() {
        //super.getScreen();
        return "SmartWatch{" +
                "strap='" + strap + '\'' +
                ", compatibility='" + compatibility + '\'' +
                ", screen='" + super.getScreen() + '\'' +
                ", battery='" + super.getBattery() + '\'' +
                ", weight='" + super.getWeight() + '\'' +
                ", height='" + super.getHeight() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                "} ";
    }
}

