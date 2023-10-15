 /* This class provides a universal template for any object in the Solar System.
  * The diameter property is simply the diameter of the object.
  * The colour property is simply the colour of the object.
  * The distance property is the distance from the object to the centre of the screen.
 */
public class CelestialBody{
    private double diameter;
    private String colour;
    private double distance;

    public CelestialBody(double diameter, String colour, double distance){
        this.diameter = diameter;
        this.distance = distance;
        this.colour = colour;
    }

    // A getter method for the diameter property:
    public double getDiameter(){
        return diameter;
    }
    
    // A getter method for the distance property:
    public double getDistance(){
        return distance;
    }

    // A getter method for the colour property:
    public String getColour(){
        return colour;
    }
}