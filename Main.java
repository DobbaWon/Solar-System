import java.util.ArrayList; // import the ArrayList class

public class Main{
    public static void main(String[] args){
        // First we create 2 new lists for the planets and moons, for easier drawing.
        ArrayList<CelestialBody> planets = new ArrayList<CelestialBody>();
        ArrayList<Moon> moons = new ArrayList<Moon>();
        // Initiating the classes:
        SolarSystem solarSystem = new SolarSystem(1000, 1000);
        
        // The sun will not be able to move, so we can simply use a SolarObject class;
        CelestialBody sun = new CelestialBody(50, "YELLOW", 0, 0);

        // Creating all the planets and moons:
        planets.add(new CelestialBody(30, "BLUE", 100, 2)); // Earth
        moons.add(new Moon(15, "GREY", 50, 4, planets.get(0))); // The Moon

        planets.add(new CelestialBody(30, "RED", 200, 1)); // Mars

        while (1 == 1){
            // Drawing all of the objects:
            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            
            for (int i = 0; i < planets.size(); i++){
                CelestialBody currentPlanet = planets.get(i); // Saving the current planet in the loop to use with the following values:
                solarSystem.drawSolarObject(currentPlanet.getDistance(), currentPlanet.getAngle(), currentPlanet.getDiameter(), currentPlanet.getColour());
                
                planets.get(i).orbit(); // Orbiting the planet stored in the ArrayList.
            }

            for (int i = 0; i < moons.size(); i++){
                Moon currentMoon = moons.get(i); // Saving the current moon in the loop to use with the following values:
                solarSystem.drawSolarObjectAbout(currentMoon.getDistance(), currentMoon.getAngle(), currentMoon.getDiameter(), currentMoon.getColour(), currentMoon.getPlanetDistance(), currentMoon.getPlanetAngle());
                
                moons.get(i).orbit(); // Orbiting the moon stored in the ArrayList.
            }

            solarSystem.finishedDrawing();
        }
    }
}