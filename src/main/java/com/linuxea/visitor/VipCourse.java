package com.linuxea.visitor;

public class VipCourse extends Course {


    public VipCourse(String title,Integer priceCent, Integer totalSell) {
        super.title = title;
        this.priceCent = priceCent;
        this.totalSell = totalSell;
    }

    /**
     * price in cent
     */
    protected Integer priceCent;

    /**
     * total sell num
     */
    protected Integer totalSell;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }



}
