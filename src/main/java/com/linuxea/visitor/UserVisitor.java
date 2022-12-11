package com.linuxea.visitor;

public class UserVisitor implements Visitor{


    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("用户访问免费课程" + freeCourse.title);
    }

    @Override
    public void visit(VipCourse vipCourse) {
        System.out.println("用户访问 vip 课程" + vipCourse.title + ":" + vipCourse.priceCent);
    }
}
