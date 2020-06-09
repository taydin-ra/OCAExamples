package OCAExam2;

public class Rectangle {
    private double length;
    private double height;
    private double area;


    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {

        this.height = height;
        setArea(area);
    }


    public void setArea(double area) {

       area = length*height;


    }



}
