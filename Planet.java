public class Planet{
    private double diameter = 30;
    private double distance;
    private double angle;
    private String colour;
    private double rotationSpeed; // The speed of which the angle will change.

    public Planet(double distance, double angle, double rotationSpeed, String colour){
        this.distance = distance;
        this.angle = angle;
        this.colour = colour;
        this.rotationSpeed = rotationSpeed;
    }

    public double getDiameter(){
        return diameter;
    }
    public double getDistance(){
        return distance;
    }
    public double getAngle(){
        return angle;
    }
    public String getColour(){
        return colour;
    }

    public void setAngle(double value){
        this.angle = value;
    }

    public void orbit(){
        this.angle += rotationSpeed;
    }
}