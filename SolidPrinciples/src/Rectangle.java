//class implementing shape for calculating area of rectangle.
public class Rectangle implements Shape {
    private double rectangleWidth,rectangleHeight;
    public double getM_width() {
        return rectangleWidth;
    }
    public void setM_width(double m_width) {
        this.rectangleWidth = m_width;
    }
    public double getM_height() {
        return rectangleHeight;
    }
    public void setM_height(double m_height) {
        this.rectangleHeight = m_height;
    }
    @Override
    public double getArea() {
        return rectangleHeight * rectangleWidth;
    }
}
