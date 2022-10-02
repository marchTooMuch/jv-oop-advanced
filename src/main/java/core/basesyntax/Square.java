package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(double side, String color) {
        this.side = side;
        this.color = color;
        area = getArea();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq.units, side: "
                + side + " units, color: " + color);
    }
}
