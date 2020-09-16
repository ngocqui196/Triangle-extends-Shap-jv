public class Triangle extends Shap{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }



    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, String filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isTriangle() {
        if (side1 < side2 + side3
            && side2 < side1 + side3
            && side3 < side1 + side2) {
            return true;
        }else {
            return false;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        if (isTriangle()) return side1 + side2 + side3;
        return -1.0;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double area;
        if (isTriangle()) {
            area = Math.sqrt((p - side1) * (p - side2) * (p - side3));
            return area;
        } else {
            return -1.0;
        }
    }

    @Override
    public String toString() {
        return  (isTriangle()? "Tritangle= {" +
                "color= " + this.getColor() +
                ", filled= " + this.getFilled() +"," : "Is'nt triangle= {") +
                " side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                ", Perimeter= "+ getPerimeter() +
                ", Area= " + getArea() +
                '}';
    }
}
