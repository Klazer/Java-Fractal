import java.awt.*;

public class Triangle {
    private double Perimeter;
    private double Area;
    private double x_position;
    private double y_position;
    private double width;
    private double height;
    private Color color;

    public Triangle(double initx, double inity, double initwidth, double initheight){
        this.x_position = initx;
        this.y_position = inity;
        this.width = initwidth;
        this.height = initheight;

    }

    public double calculatePerimeter(double width, double height) {
        Perimeter = (2*height)+width;
        return Perimeter;
    }

    public double calculateArea(double width, double height) {
        Area = (1/2) * (width * height);
        return Area;
    }

    public void setColor(Color enteredColor){

        color = enteredColor;
    }

    public void setPos(double enteredX, double enteredY){
        this.x_position = enteredX;
        this.y_position = enteredY;
    }

    public void setHeight(double enteredHeight) {
        this.height = enteredHeight;
    }

    public void setWidth(double enteredWidth) {
        this.width = enteredWidth;
    }

    public Color getColor() {

        return this.color;
    }

    public double getXPos() {

        return this.x_position;
    }

    public double getYPos() {

        return this.y_position;
    }

    public double getHeight() {

        return this.height;
    }

    public double getWidth() {

        return this.width;
    }
}

