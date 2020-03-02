package com.ab.prototype.improve.deepclone;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "ab";
        p.deepCloneableTarger = new DeepCloneableTarger("asd", "asdf");

        //方式1,完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println(p.name + "--" + p.deepCloneableTarger + "\n" + p.deepCloneableTarger.hashCode());
        System.out.println(p2.name + "--" + p2.deepCloneableTarger + "\n" + p2.deepCloneableTarger.hashCode());

        //方式2:序列化完成深拷贝
        System.out.println("---");
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println(p.name + "--" + p.deepCloneableTarger + "\n" + p.deepCloneableTarger.hashCode());
        System.out.println(p3.name + "--" + p3.deepCloneableTarger + "\n" + p2.deepCloneableTarger.hashCode());

    }
}