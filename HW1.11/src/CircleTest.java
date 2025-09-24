import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for radius and store in variable
        System.out.println("Please enter the radius of the circle ");
        int radius = input.nextInt();

        //create circle object
        Circle testCircle = new Circle(radius);

        //get area
        double area = testCircle.getArea();
        // print

        System.out.println("The area of the circle is "+area+" with radius "+radius);
    }
}
