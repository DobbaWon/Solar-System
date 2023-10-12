public class Main{
    public static void main(String[] args){
        // Initiating my classes:
        SolarSystem solarSystem = new SolarSystem(1000, 1000);
        Sun sun = new Sun();
        Planet earth = new Planet(100, 0, 1, "BLUE");
        Moon moon = new Moon(50, 0, "GREY");
        Planet mars = new Planet(200, 0, 0.6, "RED");

        while (1 == 1){
            // Drawing all of the objects:
            solarSystem.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            solarSystem.drawSolarObject(earth.getDistance(), earth.getAngle(), earth.getDiameter(), earth.getColour());
            solarSystem.drawSolarObjectAbout(moon.getDistance(), moon.getAngle(), moon.getDiameter(), moon.getColour(), earth.getDistance(), earth.getAngle());
            solarSystem.drawSolarObject(mars.getDistance(), mars.getAngle(), mars.getDiameter(), mars.getColour());

            solarSystem.finishedDrawing();

            // Making the objects rotate:
            earth.orbit();
            moon.orbit();
            mars.orbit();
        }
    }
}