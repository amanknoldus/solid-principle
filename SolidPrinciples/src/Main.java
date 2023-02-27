import java.util.Scanner;
public class Main {
	public static void main(String args[]){

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Dimensions of Rectangle: ");
		double recWidth = userInput.nextDouble();
		double recHeight = userInput.nextDouble();

		System.out.println("Enter the Dimension of Square: ");
		double sqrSide = userInput.nextDouble();

		Rectangle recObject = new Rectangle();
		recObject.setM_width(recWidth);
		recObject.setM_height(recHeight);

		System.out.println("Area of Rectangle: " + recObject.getArea());

		Square sqrObject = new Square();
		sqrObject.setSide(sqrSide);

		System.out.println("Area of Square: " + sqrObject.getArea());
	}
}