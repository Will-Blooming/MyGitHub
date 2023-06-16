package assertive.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
abstract class A1{
    public abstract void hi();
    public void say(){

    }
    public abstract void cry();
}
class B1 extends A1{
    @Override
    public void hi() {//相当于子类实现了父类的方法。（有方法体。大括号）

        /*
        ...
         */
    }

    @Override
    public void cry() {

    }
}