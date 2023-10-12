public class Moon{
    private double diameter = 15;
    private double distance;
    private double angle;
    private String colour;

    public Moon(double distance, double angle, String colour){
        this.distance = distance;
        this.angle = angle;
        this.colour = colour;
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

    public void orbit(){
        this.angle -= 0.5;
    }
}
