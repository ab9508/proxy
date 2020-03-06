package com.ab.visitor;

/**
 * @author ab
 * @description
 * @date
 */
public class Wait extends Action {
    /**
     * 得到男的测评结果
     *
     * @param man
     */
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价:待定");
    }

    /**
     * 得到女的测评
     *
     * @param woman
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女的给的评价:待定");
    }
}
