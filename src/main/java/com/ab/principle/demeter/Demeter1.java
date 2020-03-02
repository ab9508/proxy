package com.ab.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ab
 * @description 有一个学校，下属有各个学院和总部，现要求打印出学校总部员工 ID 和学院员工的 id
 * @date
 */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManagere schoolManagere = new SchoolManagere();
        //输出学院员工id和学校总部员工信息
        schoolManagere.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院的员工类
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }
}


//学校管理类
//分析SchoolManager类的直接朋友类有哪些Employee,CollegeManager
//CollegeEmployee不是直接朋友二十一个陌生类,违背了迪米特法则
class SchoolManagere {
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        ArrayList<Employee> list = new ArrayList<Employee>();
        //增加5个员工到list
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    //输出学校总部和学院员工信息
    void printAllEmployee(CollegeManager sub) {
        //1.这里的CollageEmployee不是SchoolManager的直接朋友
        //2.CollegeEmployee是以局部变量方式出现在SchoolManager
        //3.违反了迪米特法则

        //获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----学院员工----");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----学校总部员工---");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }

    }

}

