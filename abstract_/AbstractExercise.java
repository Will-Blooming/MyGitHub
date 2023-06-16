package assertive.hspedu.abstract_;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class AbstractExercise {
    public static void main(String[] args) {

        CommonEmployee commonEmployee = new CommonEmployee("张三","001",6000);
        commonEmployee.work();

        Manger manger = new Manger("lisa", "111", 10000);
        manger.setBone(5000);
        manger.work();
    }
}

abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + getName() + " 工作中..." + getSalary());
    }
}

class Manger extends Employee{
    private double bone;

    public Manger(String name, String id, double salary) {
        super(name, id, salary);
    }

    public double getBone() {
        return bone;
    }

    public void setBone(double bone) {
        this.bone = bone;
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + " 工作中..." + (getSalary() + bone));
    }
}