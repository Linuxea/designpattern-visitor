package com.linuxea.visitor;

public abstract class Course {

    /**
     * course title
     */
    protected String title;

    /**
     * visit course by visitor
     * @param visitor abstract visitor
     */
    public abstract void visit(Visitor visitor);

}
