public class Rec{
    private double length;
    private double width;

    public Rec(double l, double w){
        length = l;
        width = w;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width * length;
    }


}
