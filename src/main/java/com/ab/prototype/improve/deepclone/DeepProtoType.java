package com.ab.prototype.improve.deepclone;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @author ab
 * @description
 * @date
 */
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarger deepCloneableTarger;

    public DeepProtoType() {
    }

    /**
     * 深拷贝:1.使用克隆方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对基本数据类型和String的克隆
        deep = super.clone();
        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarger = (DeepCloneableTarger) deepCloneableTarger.clone();
        return deep;
    }

    /**
     * 深拷贝:2. 通过对象的序列化实现(推荐)
     */
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化,把对象以流的方式输出
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deep = (DeepProtoType) ois.readObject();
            return deep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                //关流
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}
