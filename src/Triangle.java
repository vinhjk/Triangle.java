import java.util.Scanner;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private String color = "Green";

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getSide1(){
        return this.side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getArea(){
        double x = this.side1;
        double y = this.side2;
        double z = this.side3;
        return Math.sqrt((x + y + z) * (x + y -z) * (x + z - y) * (z + y -x)) / 4;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "A Triangle with side 1 = "
                + getSide1()
                + ", side 2 = "
                + getSide2()
                + ", side 3 = "
                + getSide3()
                + ", Area = "
                + getArea()
                + ", Perimeter = "
                + getPerimeter()
                + ", Color is : "
                + getColor();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1 : ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 : ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 : ");
        double side3 = scanner.nextDouble();
        System.out.print("Enter color : ");
        String color = scanner.next();

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle);

        triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
