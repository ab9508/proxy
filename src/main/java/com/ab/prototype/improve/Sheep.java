package com.ab.prototype.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend;//

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name= " + name + ",age= " + age + ",color= " + color + ",address= " + address;
    }

    /**
     * 克隆该实例，使用默认的clone()完成
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
