public class Main{
    public static void main(String[] args){
        // Initiating my classes:
        SolarSystem solarSystem = new SolarSystem(1000, 1000);
        
        // The sun will not be able to move, so we can simply use a SolarObject class;
        CelestialBody sun = new CelestialBody(50, "YELLOW", 0, 0);
        CelestialBody earth = new CelestialBody(30, "BLUE", 100, 2);
        Moon moon = new Moon(15, "GREY", 50, 4, earth);
        CelestialBody mars = new CelestialBody(30, "RED", 200, 1);

        while (1 == 1){
            // Drawing all of the objects:
            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            solarSystem.drawSolarObject(earth.getDistance(), earth.getAngle(), earth.getDiameter(), earth.getColour());
            solarSystem.drawSolarObjectAbout(moon.getDistance(), moon.getAngle(), moon.getDiameter(), moon.getColour(), moon.getPlanetDistance(), moon.getPlanetAngle());
            solarSystem.drawSolarObject(mars.getDistance(), mars.getAngle(), mars.getDiameter(), mars.getColour());

            solarSystem.finishedDrawing();

            // Making the objects rotate:
            earth.orbit();
            moon.orbit();
            mars.orbit();
        }
    }
}