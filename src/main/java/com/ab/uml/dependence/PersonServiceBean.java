package com.ab.uml.dependence;

/**
 * @author ab
 * @description
 * @date
 */
public class PersonServiceBean {
    private PersonDao personDao;//类

    public void save(Person person) {
    }

    public IDCard getIDCard(Integer personid) {
        return new IDCard();
    }

    public void modify() {
        Department department = new Department();
    }

}

