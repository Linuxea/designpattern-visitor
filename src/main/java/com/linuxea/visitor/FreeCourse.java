package com.linuxea.visitor;

public class FreeCourse extends Course {

    public FreeCourse(String title) {
        super.title = title;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
