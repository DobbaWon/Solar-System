public class Object{
    // The Object class is a class that simply holds the shared values of each class, as seen below:

    private double diameter;
    private double distance; // Set to 0 if it is the sun.
    private double angle; // Set to 0 if it is the sun.
    private String colour;

    public Object(double diameter, double distance, double angle, String colour){
        this.diameter = diameter;
        this.distance = distance;   
        this.angle = angle;
        this.colour = colour;
    }

    public double getDiameter(){
        return diameter;
    }
    public double getDistance(){
        return distance;
    }
    public double getAngle(){
        return angle;
    }
    public String getColour(){
        return colour;
    }
}