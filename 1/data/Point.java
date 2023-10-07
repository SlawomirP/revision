package data;

public class Point {
    private int cordHorizontal;
    private int cordVertical;

    public Point (){}
    public Point (int cordHorizontal, int cordVertical){
        this.cordHorizontal = cordHorizontal;
        this.cordVertical = cordVertical;
    }

    public int getCordHorizontal() {
        return cordHorizontal;
    }

    public void setCordHorizontal(int cordHorizontal) {
        this.cordHorizontal = cordHorizontal;
    }

    public int getCordVertical() {
        return cordVertical;
    }

    public void setCordVertical(int cordVertical) {
        this.cordVertical = cordVertical;
    }

    public String showInfo (){
        return "cord x: " + getCordHorizontal() + ", cord y: " + getCordVertical();
    }
}
