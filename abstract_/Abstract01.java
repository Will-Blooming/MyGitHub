package assertive.hspedu.abstract_;

import adamancy.hspedu.modifier.A;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    public void eat(){
//        System.out.println("这是一个动物吃食物的方法，但是动物和食物不知道是什么");//所以，这个方法在这里并没有什么意义
//        //可以定义为抽象类
//    }

    public abstract void eat() ;
    //当类中的方法有抽象的方法时，类也要声明为abstract类。
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }
}