package task_1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task_1.bean.*;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans_1.xml");

        A a = context.getBean("a", A.class);
        System.out.println(a);

        B b = context.getBean("b", B.class);
        System.out.println(b);

        C c = context.getBean("c", C.class);
        System.out.println(c);

        D d = c.newD();
        System.out.println("d = " + d);
        D dd = c.newD();
        System.out.println("dd = " + dd);
        System.out.println("d == dd is " + (d == dd) + ", because scope - prototype");

        E e = context.getBean("e", E.class);
        System.out.println(e);
        e.doingSomething();

        F f = context.getBean("f", F.class);
        System.out.println(f);
        context.close();

    }
}
