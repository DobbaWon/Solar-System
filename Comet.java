/** Comet Class
 * This class is an extension of the Planet Class
 * This class overrides the orbit() method, to allow for a non-circular orbit.
 * @author Charlie Dobson
 */
public class Comet extends Planet{

    /** Class Constructor
     * Creates an instance of the Comet Class
     * @param diameter - The diameter of the Comet
     * @param colour - The colour of the Comet
     * @param distance - The inital distance from the centre of the screen
     * @param rotationVelocity - The speed at which the Comet rotates.
     */
    public Comet(double diameter, String colour, double distance, double rotationVelocity){
        super(diameter, colour, distance, rotationVelocity);
    }

    /** Overridden orbit Method
     * This method overrides the Planet Class's orbit method
     * This method increases and decreases the distance property based on the angle
     */
    @Override public void orbit(){
        super.orbit();

        // We first need to find how many orbits there have been:
        int orbits = (int)getAngle() / 360;
        // Now we use this to find the actual angle:
        int actualAngle = (int)getAngle()-(orbits * 360);

        // Now we need to change the distance of the Comet based on the angle:
        if (actualAngle / 60 == 2 || actualAngle / 60 == 5){
            setDistance(getDistance() + 2);
        }
        if (actualAngle / 60 == 3 || actualAngle / 60 == 0){
            setDistance(getDistance() - 2);
        }

        // This made the Comet move very robotically, not very smoothly. Lets smooth it:
        if (actualAngle / 60 == 1){
            setDistance(getDistance() + 1);
        }
        if (actualAngle / 60 == 4){
            setDistance(getDistance() - 1);
        }
    }
}