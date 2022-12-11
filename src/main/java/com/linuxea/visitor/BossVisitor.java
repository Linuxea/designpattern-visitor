package com.linuxea.visitor;

public class BossVisitor implements Visitor{

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("老板访问免费课程" + freeCourse.title);
    }

    @Override
    public void visit(VipCourse vipCourse) {
        System.out.println("老板访问 vip 课程" + vipCourse.totalSell);
    }
}
