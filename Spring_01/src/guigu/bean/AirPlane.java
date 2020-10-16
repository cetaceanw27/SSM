package guigu.bean;

public class AirPlane {

    private String fdj;
    private String yc;
    private Integer personNum;
    private String jzName;
    private String fjzName;



    @Override
    public String toString() {
        return "AirPlane{" +
                "fdj='" + fdj + '\'' +
                ", yc='" + yc + '\'' +
                ", personNum=" + personNum +
                ", jzName='" + jzName + '\'' +
                ", fjzName='" + fjzName + '\'' +
                '}';
    }

    public String getFdj() {
        return fdj;
    }

    public void setFdj(String fdj) {
        this.fdj = fdj;
    }

    public String getYc() {
        return yc;
    }

    public void setYc(String yc) {
        this.yc = yc;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getJzName() {
        return jzName;
    }

    public void setJzName(String jzName) {
        this.jzName = jzName;
    }

    public String getFjzName(String fjz) {
        return fjzName;
    }

    public void setFjzName(String fjzName) {
        this.fjzName = fjzName;
    }
}
