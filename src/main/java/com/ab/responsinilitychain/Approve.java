package com.ab.responsinilitychain;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class Approve {
    /**
     * 下一个处理者
     */
    Approve approve;
    /**
     * 名字
     */
    String name;

    public Approve(String name) {
        this.name = name;
    }


    /**
     * 下一个处理者
     */
    public void setApprover(Approve approver) {
        this.approve = approver;
    }

    @Override
    public String toString() {
        return "Approve{" +
                "approve=" + approve +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 处理审批请求的方法,得到一个请求,处理是子类完成,因此该方法时抽象
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
