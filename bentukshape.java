

  // Kelas abstrak Shape
abstract class Shape {
    String color;

    // Konstruktor
    public Shape(String color) {
        this.color = color;
    }

    // Metode abstrak untuk menghitung luas
    abstract double getArea();
}

// Kelas Triangle yang merupakan turunan dari Shape
class Triangle extends Shape {
    double base;
    double height;

    // Konstruktor
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // Implementasi metode getArea untuk segitiga
    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

// Kelas Circle yang merupakan turunan dari Shape
class Circle extends Shape {
    double radius;

    // Konstruktor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementasi metode getArea untuk lingkaran
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Kelas utama untuk menjalankan program
class Main {
    public static void main(String[] args) {
        // Membuat objek segitiga dan lingkaran
        Triangle triangle = new Triangle("Red", 10, 5);
        Circle circle = new Circle("Blue", 7);

        // Menampilkan luas masing-masing bentuk
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
