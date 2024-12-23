import java.lang.Math;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideB = sideB;
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideC = sideC;
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public void printInfo() {
        System.out.println("Треугольник:");
        System.out.printf("Сторона A: %.2f\n", sideA);
        System.out.printf("Сторона B: %.2f\n", sideB);
        System.out.printf("Сторона C: %.2f\n", sideC);
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }

    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            triangle.printInfo();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}