package assertive.hspedu.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        System.out.println(new AA(200).a);//200
        AA.hi();//hi

        System.out.println(AA.a);//200
        AA aa = new AA(100);
        System.out.println(aa.a);//100
        System.out.println(aa.getA());
    }
}

class AA {
    public static int a = 1;//因为a是静态的：为公共全局变量（一个改全改）

    public AA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void hi() {
        System.out.println("hi");
    }
}