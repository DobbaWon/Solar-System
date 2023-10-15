/* Planet Class
 * This class inherits from the CelestialBody class, as it shares properties with other objects.
 * The Planet class stores the angle from the Sun for its object
 * It also stores the speed at which it rotates around the Sun.
 */
public class Planet extends CelestialBody{
    private double angle;
    private double rotationVelocity;

    public Planet(double diameter, String colour, double distance, double rotationVelocity){
        // Feeding the diameter, colour and distance back to the base class for storage:
        super(diameter, colour, distance);

        this.rotationVelocity = rotationVelocity;
        this.angle = 0; // The angle always starts at 0 for a planet.
    }

    // A method that easily rotates the planet (called once per tick):
    public void orbit(){
        angle += rotationVelocity;
    }

    // A getter method for the angle property:
    public double getAngle(){
        return angle;
    }
}