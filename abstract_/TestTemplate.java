package assertive.hspedu.abstract_;

/**
 * 模板模式的优点
 * 1）具体细节步骤实现定义在子类中，子类定义详细处理算法是不会改变算法整体结构。
 * 2）代码复用的基本技术，在数据库设计中尤为重要。
 * 3）存在一种反向的控制结构，通过一个父类调用其子类的操作(动态绑定。)，通过子类对父类进行扩展增加新的行为（job中），符合“开闭原则”。
 */

public class TestTemplate {//测试模板

    public static void main(String[] args) {

        A2 a2 = new A2();
        //a2.say();
        a2.calculateTime();//去找方法，遵循从小到大，子类没有，所以去调用父类的calculateTime方法。

        B2 b2 = new B2();
        b2.calculateTime();//对象不同 job方法不同，看运行类型的对象  B2的job方法。
    }
}
abstract class Template{

//    public void say(){
//
//    }
    //变化二
    public abstract void job();//抽象方法

    public void calculateTime(){//计算  实现方法，调用job方法
        long start = System.currentTimeMillis();//记录时间
        job();//这里是动态绑定机制***
        //方法是要看运行类型A2，所以去A2找say（）方法。

        long end = System.currentTimeMillis();//到毫秒
        System.out.println("任务的执行时间为" + (end - start));

    }
    //这时再有不同的job，在子类中就可以光写需要完成的。
    //相当于重写父类，当调用时，因为动态绑定机制，所以会去找子类的方法。
}


class A2 extends Template{

    //变化1
//    public void calculateTime(){//计算
//        long start = System.currentTimeMillis();
//        job();
//        long end = System.currentTimeMillis();//到毫秒
//        System.out.println("A2的执行时间为" + (end - start));
//
//    }


    //计算任务：1 + ... + 800000
    public void job() {//重写

        //开始时间
        //long start = System.currentTimeMillis();

        long sum = 0;
        for (long i = 0; i < 80000000; i++) {

            sum += i;
        }

//        long end = System.currentTimeMillis();//到毫秒
//        System.out.println("A2的执行时间为" + (end - start));
    }
}

class B2 extends Template{
    //变化1
//    public void calculateTime(){
//        long start = System.currentTimeMillis();
//
//        job();
//        //job3();
//        long end = System.currentTimeMillis();//到毫秒
//        System.out.println("B2的执行时间为" + (end - start));
//
//    }


    public void job() {
        //long start = System.currentTimeMillis();

        long sum = 0;
        for (long i = 0; i < 800000; i++) {

            sum *= i;
        }

//        long end = System.currentTimeMillis();//到毫秒
//        System.out.println("B2的执行时间为" + (end - start));
    }

    public void job3(){//如果也想用，可以新建一个类，改名为job();
        /*
        ...大量重复...
         */
    }
}