package com.demo.deep;

/**
 * @author ab
 * @description
 * @date
 */
public class DeepRequest {
    int id;
    String name;
    int age;

    private static volatile DeepRequest deepRequest;


    /**
     * 单例
     *
     * @return DeepRequest deepRequest
     */
    public static DeepRequest getInstance() {
        if (deepRequest == null) {
            synchronized (DeepRequest.class) {
                if (deepRequest == null) {
                    deepRequest = new DeepRequest();
                }
            }
        }
        return deepRequest;
    }

    private DeepRequest() {
    }

    @Override
    public String toString() {
        return "DeepRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
