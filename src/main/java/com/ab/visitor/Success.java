package com.ab.visitor;

/**
 * @author ab
 * @description
 * @date
 */
public class Success extends Action {
    /**
     * 得到男的测评结果
     *
     * @param man
     */
    @Override
    public void getManResult(Man man) {
        System.out.println(man + ",男人给的评价:success");
    }

    /**
     * 得到女的测评
     *
     * @param woman
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman + ",女人给的评价是:success");
    }
}
