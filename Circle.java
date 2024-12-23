import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.println("Круг:");
        System.out.printf("Радиус: %.2f\n", radius);
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Окружность: %.2f\n", calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printInfo();
    }
}import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.println("Круг:");
        System.out.printf("Радиус: %.2f\n", radius);
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Окружность: %.2f\n", calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printInfo();
    }
}