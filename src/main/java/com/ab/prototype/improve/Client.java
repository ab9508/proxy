package com.ab.prototype.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();

        System.out.println(sheep + "\nfriend= " + sheep.friend + ",hashcode= " + sheep.friend.hashCode());
        System.out.println(sheep1 + "\nfriend= " + sheep1.friend + ",hashcode= " + sheep1.friend.hashCode());
        System.out.println(sheep2 + "\nfriend= " + sheep2.friend + ",hashcode= " + sheep2.friend.hashCode());
        System.out.println(sheep3 + "\nfriend= " + sheep3.friend + ",hashcode= " + sheep3.friend.hashCode());

    }
}
