/** The Planet Class
 * This class inherits from the CelestialBody class, as it shares properties with other objects.
 * The Planet class stores the angle from the Sun for its object
 * It also stores the speed at which it rotates around the Sun.
 * @author Charlie Dobson
 */
public class Planet extends CelestialBody{
    private double angle;
    private double rotationVelocity;
    private double distance;

    /** Class Constructor
     * Creates an instance of the Planet class
     * @param diameter - the diameter in px of the object
     * @param colour - the colour of the object
     * @param distance - the distance in px of the object to the centre of the screen
     * @param rotationVelocity - the speed at which the angle from the centre of the screen increases  
     */
    public Planet(double diameter, String colour, double distance, double rotationVelocity){
        // Feeding the diameter, colour and distance back to the base class for storage:
        super(diameter, colour);

        this.rotationVelocity = rotationVelocity;
        this.angle = 0; // The angle always starts at 0 for a planet.
        this.distance = distance;
    }

    // A method that easily rotates the planet (called once per tick):
    public void orbit(){
        angle += rotationVelocity;
    }

    // A getter method for the angle property:
    public double getAngle(){
        return angle;
    }

    // A getter method for the distance property:
    public double getDistance(){
        return distance;
    }

    /** A setter method for the angle property, used by the Asteroid class:
     * @param value - the value for the angle to be set to
     */
    public void setAngle(double value){
        this.angle = value;
    }

    /** A setter method for the distance property, used by the Comet class:
     * @param value - the value for the distance to be set to
     */
    public void setDistance(double value){
        this.distance = value;
    }
}
