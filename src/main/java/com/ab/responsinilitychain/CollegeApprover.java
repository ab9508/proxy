package com.ab.responsinilitychain;

/**
 * @author ab
 * @description
 * @date
 */
public class CollegeApprover extends Approve {

    public CollegeApprover(String name) {
        super(name);
    }

    /**
     * 处理审批请求的方法,得到一个请求,处理是子类完成,因此该方法时抽象
     *
     * @param purchaseRequest
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求id:" + purchaseRequest.getId() + ",被" + this.name + "处理");
        } else {
            approve.processRequest(purchaseRequest);
        }
    }
}
