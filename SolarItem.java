public class SolarItem{
    // The Object class is a class that simply holds the shared values of each class, as seen below:

    private double diameter;
    private double distance; // Set to 0 if it is the sun.
    private double angle; // Set to 0 if it is the sun.
    private String colour;
    private int x; // Set to 0 if it is the sun.
    private int y; // Set to 0 if it is the sun.

    public SolarItem(int x, int y, double diameter, double distance, double angle, String colour){
        this.x = x;
        this.y = y;
        this.diameter = diameter;
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
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    public void setAngle(double value){
        this.angle = value;
    }
}