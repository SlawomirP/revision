package logic;

import data.Point;

public class PointController {

    void addX (Point point, int value){
        int addResult = point.getCordHorizontal() + value;
        point.setCordHorizontal(addResult);
    }
    void minusX (Point point, int value){
        int subResult = point.getCordHorizontal() - value;
        point.setCordHorizontal(subResult);
    }
    void addY (Point point, int value){
        int addResult = point.getCordVertical() + value;
        point.setCordVertical(addResult);
    }
    void minusY (Point point, int value){
        int subResult = point.getCordVertical() - value;
        point.setCordVertical(subResult);
    }


}
