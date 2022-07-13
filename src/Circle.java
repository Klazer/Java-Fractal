import java.awt.*;

public class Circle<enteredRadius> {
    private double x_position;
    private double y_position;
    private double radius;
    private double Perimeter;
    private double Area;
    private Color color;



    public Circle(double initx, double inity, double initradius) {
        this.x_position = initx;
        this.y_position = inity;
        this.radius = initradius;

    }
    public double caclulatePerimeter(double radius) {
            Perimeter = 2*3.14*radius;
            return Perimeter;
    }

    public double calculateArea(double radius) {
                Area = 3.14*Math.pow(radius, 2);
                return Area;
            }


    public void setColor(Color enteredColor) {
        color = enteredColor;

    }

    public void setPos(double enteredX, double enteredY) {
        this.x_position = enteredX;
        this.y_position = enteredY;
    }

    public void setRadius(double enteredRadius){
        this.radius = enteredRadius;
        }

    public Color getColor() {
            return this.color;
    }

    public double getXPos() {
            return x_position;
    }

    public double getYPos(){
            return y_position;
    }

    public double getRadius() {
            return radius;
    }

    public static void fractalCircle(double x_position, double y_position, double width, double height, int count, Canvas drawing) {
        Triangle myc = new Triangle(x_position, y_position, width, height);
        double newwidth = myc.getWidth() / 2;
        double newheight = myc.getHeight() / 2;
        //Triangle myu = new Triangle(xPosition + 2*y, yPosition, y, z);
        //Triangle my = new Triangle(xPosition+ y/2, yPosition - x, y, z);
        myc.setColor(Color.BLUE);
        //myu.setColor(Color.RED);
        //my.setColor(Color.green);
        //drawing.drawShape(my);
        drawing.drawShape(myc);
        //drawing.drawShape(myu);
        System.out.println("1: " + i);
        myc.fractalCircle(x_position - y, yPosition, y, z, i - 1, drawing);
        myc.setColor(Color.red);
        System.out.println("2: " + i);
        myc.fractalCircle(x_position + 2*y, yPosition, y, z, i-1, drawing);
        //myc.setColor(Color.green);
        myc.fractalCircle(x_position +y/2, yPosition-x, y, z, i-1,drawing);
        //return (myc.calculateArea());
    }
}
