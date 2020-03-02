package com.ab.principle.ocp.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shape类,根据m_type类绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }

    private void drawTriangle(Shape s) {
        System.out.println("三角形");
    }

    public void drawRectangle(Shape s) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }

}

abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    public void draw() {
        System.out.println("绘制三角形");
    }
}

class Other extends Shape {
    Other() {
        super.m_type = 4;
    }

    public void draw() {
        System.out.println("绘制其他图形");
    }
}
