public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public void printInfo() {
        System.out.println("Прямоугольник:");
        System.out.printf("Ширина: %.2f\n", width);
        System.out.printf("Длина: %.2f\n", length);
        System.out.printf("Площадь: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }

    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(10, 20);
            rectangle.printInfo();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}