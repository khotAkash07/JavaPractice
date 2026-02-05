package org.Feb26.dp;

class SingletonDemo{

    private static SingletonDemo singletonDemo;
    private SingletonDemo(){} //This is private constructor
    public static SingletonDemo getInstance(){
        if(singletonDemo == null)
            singletonDemo = new SingletonDemo();
        return singletonDemo;
    }

}
public class SingletonEx {
    public static void main(String[] args) {

        SingletonDemo demo1 = SingletonDemo.getInstance();
        SingletonDemo demo2 = SingletonDemo.getInstance();
        System.out.println(demo1.hashCode());
        System.out.println(demo2.hashCode());

    }
}
