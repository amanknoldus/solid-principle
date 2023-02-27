//class implementing shape for calculating area of square.
public class Square implements Shape {
    private double squareSide;
    public double getSide() {
        return squareSide;
    }
    public void setSide(double side) {
        this.squareSide = side;
    }
    @Override
    public double getArea() {
        return squareSide * squareSide;
    }
}
