package com.ab.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();

    }
}
