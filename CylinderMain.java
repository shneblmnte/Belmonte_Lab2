import java.util.Scanner;

public class CylinderMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To be able to do inputting and scanned the input numbers.
        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter Height: ");
        double height  = input.nextDouble();
        Cylinder merge = new Cylinder(radius, height); // Call out the cylinder area function.
        merge.CylinderArea();
        CylinderVol merged = new CylinderVol(radius, height); // Call out the cylinder volume function.
        merged.CylinderVolume();
        input.close(); // To close the inputting of numbers.
    }
}


class Cylinder { // Base class;
    // Using protected access modifier that can only be accessed by the member of the base class.
    protected double radius;
    protected double height;
    protected double pi = 3.14;

    public Cylinder(double radius, double height) { // Constructor of the cylinder area.
        this.radius = radius;
        this.height = height;
    }

    public void CylinderArea() { // Function of the cylinder area.
        double area = area();
        System.out.print("Area of Cylinder: " + area);
        System.out.println();
    }

    private double area() { // Calculate the area.
        return 2 * pi * radius * radius + 2 * radius * height;
    }
}

class CylinderVol extends Cylinder { // Using extend to inherit the properties of another class.

    public CylinderVol(double radius, double height) {
        super(radius, height); // To call the constuctor of the base class.
    }

    public void CylinderVolume() { // Function of the cylinder volume.
        double volume = volume();
        System.out.print("Volume of Cylinder: " + volume);
        System.out.println();
    }

    private double volume() { // Calculate the volume.
        return pi * radius * radius * height;
    }
}
