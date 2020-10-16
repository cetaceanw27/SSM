package guigu.factory;

import com.guigu.bean.AirPlane;

public class AirplaneStaticFactory {

    public static AirPlane getAirplane(String jzName){

        System.out.println("static is building");

        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("东航");
        airPlane.getFjzName("Fjz");
        airPlane.setJzName(jzName);
        airPlane.setPersonNum(777);
        airPlane.setYc("1234m");
        return airPlane;

    }
}
