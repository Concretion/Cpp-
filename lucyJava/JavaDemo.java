public class JavaDemo {
    {
        System.out.println("test1");
    }
    static {
        System.out.println("test2");
    }
    public static void main(String[] args) {
        new JavaDemo();
    }
}

class Dept {
    private long deptno;
    private String dname;
    private String loc;
    public Dept() {
    }

    public long getDeptno() {
        return deptno;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    

}