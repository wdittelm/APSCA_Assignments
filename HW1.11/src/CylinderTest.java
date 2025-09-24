import java.util.Scanner;
public class CylinderTest {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
         //Prompt and store radius and height
        System.out.println("Enter the radius of the cylinder ");
        int radius = input.nextInt();
        System.out.println("Enter the height of the cylinder ");
        int height = input.nextInt();

        //create new cylinder object
        Cylinder testCylinder = new Cylinder(radius, height);

        // Print get volume return value

        System.out.println("The volume of the cylinder is " + testCylinder.getVolume());

    }
}
