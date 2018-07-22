/**
 * Created by wwg on 2018/7/22.
 */
public class RobotCar {

    private int xPosition;

    private int yPosition;

    private String direction;

    RobotCar(int x, int y, String direction){
        this.xPosition = x;
        this.yPosition = y;
        this.direction = direction;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "RobotCar{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", direction='" + direction + '\'' +
                '}';
    }
}
