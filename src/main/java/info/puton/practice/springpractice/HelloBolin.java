package info.puton.practice.springpractice;

import info.puton.practice.springpractice.beans.Cake;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pauline on 16/9/26.
 */
public class HelloBolin {

    public static void main(String[] args) {
//        System.out.println("aaa");

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"services.xml"});


//        Cake myCake = context.getBean("myCake");
        Cake myCake = context.getBean("myCake",Cake.class);

//        myCake.setName("慕斯蛋糕");

        System.out.println(myCake.getName());
        System.out.println(myCake.getType());


    }

}
