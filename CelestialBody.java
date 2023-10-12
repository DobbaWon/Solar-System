// This class provides a universal template for any object in the Solar System.

public class CelestialBody{

    private double diameter;
    private String colour;
    private double angle;
    private double rotationVelocity;
    private double distance;

    public CelestialBody(double diameter, String colour, double distance, double rotationVelocity){
        /* The following values will be set to 0 for the sun:
         * x
         * y
         * rotation velocity
         * distance
         * angle */

        this.diameter = diameter;
        this.distance = distance;
        this.colour = colour;
        this.angle = 0; // The angle starts at 0 and increases each time the orbit() method is called.
        this.rotationVelocity = rotationVelocity;
    }

    public void orbit(){
        angle += rotationVelocity;
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