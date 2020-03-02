package com.ab.principle.ocp;

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
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shape类,根据m_type类绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
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

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
