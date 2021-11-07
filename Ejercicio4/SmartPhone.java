package es.Ejercicios.Ejercicio4;

public class SmartPhone extends SmartDevice {
    private String camera;
    private String operatingSystem;
    private String carcase;

    public SmartPhone() {

    }

    public SmartPhone(Double screen,
                      String battery,
                      Double weight,
                      Double height,
                      String color,
                      String brand,
                      String camera,
                      String operatingSystem,
                      String carcase) {
        super(screen, battery, weight, height, color, brand);
        this.camera = camera;
        this.operatingSystem = operatingSystem;
        this.carcase = carcase;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camera='" + camera + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", carcase='" + carcase + '\'' +
                ", screen='" + super.getScreen() + '\'' +
                ", battery='" + super.getBattery() + '\'' +
                ", weight='" + super.getWeight() + '\'' +
                ", height='" + super.getHeight() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                "}";
    }
}