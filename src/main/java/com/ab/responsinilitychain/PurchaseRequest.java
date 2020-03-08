package com.ab.responsinilitychain;

/**
 * @author ab
 * @description
 * @date
 */
public class PurchaseRequest {
    /**
     * 请求类型
     */
    private int type = 0;
    private int number = 0;
    private int price = 0;
    private int id = 0;

    public PurchaseRequest( int number, int price, int id) {
        this.number = number;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
