package logic;

import data.Point;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);

        PointController controller = new PointController();

        System.out.println(p1.showInfo());
        controller.addX(p1,1);
        System.out.println(p1.showInfo());
        controller.addY(p1,1);
        System.out.println(p1.showInfo());
        controller.minusX(p1,1);
        System.out.println(p1.showInfo());
        controller.minusY(p1,1);
        System.out.println(p1.showInfo());
    }
}
