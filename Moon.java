// This is a class just for the moons of the Solar System, which inherits from the Planet class.
// The only difference here is that the Moon class stores a body which it orbits around locally.
public class Moon extends Planet{
    // We need to store the body this CelestialBody orbits around:
    private Planet planet;

    public Moon(double diameter, String colour, double distance, double rotationVelocity, Planet planet){
        // Passing the shared values back to the base class
        super(diameter, colour, distance, rotationVelocity);

        this.planet = planet;
    }

    // A getter method for the planet's distance:
    public double getPlanetDistance(){
        return planet.getDistance();
    }

    // A getter method for the planet's angle:
    public double getPlanetAngle(){
        return planet.getAngle();
    }

}