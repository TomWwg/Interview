import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wwg on 2018/7/22.
 */
public class Main {

    public static void main(String[] args) {
        List<RobotCar> robotCarList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入参数，换行后以#结束");
        //获取X，Y的最大值
        int xmax = input.nextInt();
        int ymax = input.nextInt();
        while(!input.hasNext("#")){
            RobotCar robotCar = null;
            int x = input.nextInt();
            int y = input.nextInt();
            String direction = input.next();
            robotCar = getRobotCarPosition(xmax, ymax, x, y, direction, input);
            robotCarList.add(robotCar);
        }
        for (RobotCar car : robotCarList) {
            System.out.println(car.getxPosition() + " " + car.getyPosition() + " " + car.getDirection());
        }
    }

    public static RobotCar getRobotCarPosition(int xMax, int yMax, int x, int y, String direction, Scanner input){
        RobotCar robotCar = new RobotCar(x , y, direction);
        char[] order = input.next().replace(" ","").toCharArray();
        for (char command : order) {
            if ("L".equals(String.valueOf(command))) {
                direction = turnLeft(direction);
                robotCar.setDirection(direction);
            } else if("R".equals(String.valueOf(command))){
                direction = turnRight(direction);
                robotCar.setDirection(direction);
            } else if ("M".equals(String.valueOf(command))){
                getOneStep(robotCar);
            } else {
                System.out.println("输入命令有误！");
                input.close();
            }
        }
        if(robotCar.getxPosition() < 0 || robotCar.getxPosition() > xMax || robotCar.getyPosition() < 0 ||robotCar.getyPosition() > yMax){
            System.out.println("输入参数有误，机器人漫游车不在规定区域内！");
        }
        return robotCar;
    }

    /**
     * 左转
     * @param direction
     * @return
     */
    public static String turnLeft(String direction){
        if("E".equals(direction)){
            direction = "N";
        } else if("N".equals(direction)){
            direction = "W";
        } else if("W".equals(direction)){
            direction = "S";
        } else {
            direction = "E";
        }
        return direction;
    }

    /**
     * 右转
     * @param direction
     * @return
     */
    public static String turnRight(String direction){
        if("E".equals(direction)){
            direction = "S";
        } else if("S".equals(direction)){
            direction = "W";
        } else if("W".equals(direction)){
            direction = "N";
        } else {
            direction = "E";
        }
        return direction;
    }

    /**
     * 前进
     * @param robotCar
     * @return
     */
    public static RobotCar getOneStep(RobotCar robotCar){
        if("E".equals(robotCar.getDirection())){
            robotCar.setxPosition(robotCar.getxPosition()+1);
        } else if("N".equals(robotCar.getDirection())){
            robotCar.setyPosition(robotCar.getyPosition()+1);
        } else if("W".equals(robotCar.getDirection())){
            robotCar.setxPosition(robotCar.getxPosition()-1);
        } else {
            robotCar.setyPosition(robotCar.getyPosition()-1);
        }
        return robotCar;
    }
}
