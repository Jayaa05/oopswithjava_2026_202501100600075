abstract class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    void showBrand() {
        System.out.println("Brand: " + brand);
    }

    abstract void turnOn();
}

interface Camera {
    void takePhoto();
    void maxZoom();
}

interface CameraInfo {
    default void showCameraInfo() {
        System.out.println("Default Camera: 50 MP");
    }
}

class SmartPhone extends Device implements Camera, CameraInfo {

    SmartPhone(String brand) {
        super(brand);
    }

    void turnOn() {
        System.out.println("Camera turned on");
    }

    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    public void maxZoom() {
        System.out.println("Maximum zoom: 10x");
    }
}

public class Main {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("Samsung");

        phone.showBrand();
        phone.turnOn();
        phone.takePhoto();
        phone.maxZoom();
        phone.showCameraInfo();
    }
}