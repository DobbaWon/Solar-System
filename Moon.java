// This is a class just for the moons of the Solar System, which inherits from the CelestialBody class.
// The only difference here is that the Moon class stores a body which it orbits around locally.

public class Moon extends CelestialBody{
    // We need to store the body this CelestialBody orbits around:
    private CelestialBody planet;

    // We just need to repeat the constructor for the CelestialBody, to pass the values through to that class:
    public Moon(double diameter, String colour, double distance, double rotationVelocity, CelestialBody planet){
        super(diameter, colour, distance, rotationVelocity);

        this.planet = planet;
    }

    public double getPlanetDistance(){
        return planet.getDistance();
    }

    public double getPlanetAngle(){
        return planet.getAngle();
    }

}