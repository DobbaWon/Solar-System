// This is the exact same as a Planet class except we need to have each asteroid start at a different angle.
public class Asteroid extends Planet{
    public Asteroid(double diameter, String colour, double distance, double rotationVelocity, double angle){
        super(diameter, colour, distance, rotationVelocity);

        super.setAngle(angle); // This will overwrite the line in the base class' constructor that sets the angle to 0.
    }
}