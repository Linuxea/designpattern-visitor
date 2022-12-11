package com.linuxea;

import com.linuxea.visitor.*;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Course javaNewBee = new FreeCourse("java 新手课程");
        Course designPatter = new VipCourse("设计模式实战", 199, 10);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(javaNewBee);
        courses.add(designPatter);


        UserVisitor userVisitor = new UserVisitor();
        Consumer<Course> userVisit = course -> course.visit(userVisitor);
        courses.forEach(userVisit);


        BossVisitor bossVisitor = new BossVisitor();
        Consumer<Course> bossVisit = course -> course.visit(bossVisitor);
        courses.forEach(bossVisit);

    }
}