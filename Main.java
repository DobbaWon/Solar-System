import java.util.ArrayList; // import the ArrayList class

import javax.swing.CellEditor;

public class Main{
    public static void main(String[] args){
        // First we create 2 new lists for the planets and moons, for easier drawing.
        ArrayList<CelestialBody> planets = new ArrayList<CelestialBody>();
        ArrayList<Moon> moons = new ArrayList<Moon>();

        // Lets also have another list sfor the Asteroid Belt
        ArrayList<CelestialBody> asteroidBelt = new ArrayList<CelestialBody>();

        // Initiating the classes:
        SolarSystem solarSystem = new SolarSystem(2000, 1000);
        
        // The sun will not be able to move, so we can simply use a SolarObject class;
        CelestialBody sun = new CelestialBody(100, "YELLOW", 0, 0);

        populatePlanetsAndMoons(planets, moons);
        populateAsteroidBelt(asteroidBelt);

        // MAINLOOP:
        while (1 == 1){
            // Drawing the Sun:
            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            
            updatePlanets(solarSystem, planets);

            updateMoons(solarSystem, moons);
            
            updateAsteroids(solarSystem, asteroidBelt);
            
            solarSystem.finishedDrawing();
        }
    }

    // This method simply allows the Main method to have more space and less clutter, by isolating this code here:
    private static void populatePlanetsAndMoons(ArrayList<CelestialBody> planets, ArrayList<Moon> moons){
        // Creating all the planets and moons:
        planets.add(new CelestialBody(30, "BLUE", 150, 2)); // Earth
        moons.add(new Moon(10, "GREY", 30, 4, planets.get(0))); // The Moon

        planets.add(new CelestialBody(17, "RED", 200, 1.8)); // Mars

        planets.add(new CelestialBody(8, "RED", 80, 3)); // Mercury

        planets.add(new CelestialBody(28, "GREEN", 110, 2.5)); // Venus

        planets.add(new CelestialBody(80, "ORANGE", 270, 1.5)); // Jupiter
        // Jupiter's moons:
        moons.add(new Moon(10, "GREY", 73, 3, planets.get(4)));
        moons.add(new Moon(15, "GREY", 65, 2.5, planets.get(4)));
        moons.add(new Moon(12, "GREY", 55, 4, planets.get(4)));
        moons.add(new Moon(10, "GREY", 45, 3.5, planets.get(4)));

        // Saturns Rings:
        planets.add(new CelestialBody(80, "GREY", 350, 1.4));
        planets.add(new CelestialBody(95, "GREY", 350, 1.4));
        planets.add(new CelestialBody(85, "BLACK", 350, 1.4));

        planets.add(new CelestialBody(70, "YELLOW", 350, 1.4)); // Saturn

        planets.add(new CelestialBody(50, "BLUE", 400, 1.2)); // Neptune

        planets.add(new CelestialBody(50, "BLUE", 450, 1)); // Uranus
    }

    // This method populates the AsteroidBelt with 51 small asteroids
    private static void populateAsteroidBelt(ArrayList<CelestialBody> asteroidBelt){
        for (int i = 0; i < 51; i++){
            asteroidBelt.add(new CelestialBody(2, "GREY", 215, 0.3, i*(360/50)));
        }
    }

    // A method for drawing and orbiting all the Planets, including Saturn's rings:
    private static void updatePlanets(SolarSystem solarSystem, ArrayList<CelestialBody> planets){
        for (int i = 0; i < planets.size(); i++){
            CelestialBody currentPlanet = planets.get(i); // Saving the current planet in the loop to use with the following values:
            solarSystem.drawSolarObject(currentPlanet.getDistance(), currentPlanet.getAngle(), currentPlanet.getDiameter(), currentPlanet.getColour());
            
            planets.get(i).orbit(); // Orbiting the planet stored in the ArrayList.
        }
    }

    // A method for drawing and orbiting all of the Moons:
    private static void updateMoons(SolarSystem solarSystem, ArrayList<Moon> moons){
        for (int i = 0; i < moons.size(); i++){
            Moon currentMoon = moons.get(i); // Saving the current moon in the loop to use with the following values:
            solarSystem.drawSolarObjectAbout(currentMoon.getDistance(), currentMoon.getAngle(), currentMoon.getDiameter(), currentMoon.getColour(), currentMoon.getPlanetDistance(), currentMoon.getPlanetAngle());
            
            moons.get(i).orbit(); // Orbiting the moon stored in the ArrayList.
        }
    }
    
    // A method for drawing and orbiting all of the Asteroids:
    private static void updateAsteroids(SolarSystem solarSystem, ArrayList<CelestialBody> asteroidBelt){
        for (int i = 0; i < asteroidBelt.size(); i++){
            CelestialBody currentAsteroid = asteroidBelt.get(i); // Saving the current asteroid in the loop to use with the following values:
            solarSystem.drawSolarObject(currentAsteroid.getDistance(), currentAsteroid.getAngle(), currentAsteroid.getDiameter(), currentAsteroid.getColour());
            
            asteroidBelt.get(i).orbit();
        }
    }
}

