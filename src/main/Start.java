package main;

import impliment.robot;
import impliment.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sonyImpl.sonyArm;
import sonyImpl.sonyHead;
import toshibaimpl.toshibaLeg;

public class Start {
    public static void main(String[] args) {
        robot Robot = new robot(new sonyArm(), new sonyHead(), new toshibaLeg());
        Robot.action();
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Robot = (robot) context.getBean("t1000");
        Robot.action();
    }
}
