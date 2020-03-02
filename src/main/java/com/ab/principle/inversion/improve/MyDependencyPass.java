package com.ab.principle.inversion.improve;

/**
 * @author ab
 * @description
 * @date
 */
public class MyDependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //方式1:
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        //方式2:通过构造器进行依赖
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        //方式3:通过setter方法进行依赖
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}

class ChangHong implements ITV {

    public void play() {
        System.out.println("open changhong");
    }
}

/**
 * 方式3:
 */
interface ITV {
    public void play();
}

interface IOpenAndClose {
    public void open();

    public void setTv(ITV tv);
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void open() {
        this.tv.play();
    }

    public void setTv(ITV tv) {
        this.tv = tv;
    }
}


/**
 * 方式2:
 * <p>
 * 方式1: 通过接口实现依赖传递
 */
//interface ITV{
//    public void play();
//}
//interface IOpenAndClose{
//    public void open();
//}
//
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv=tv;
//    }
//    public void open(){
//        this.tv.play();
//    }
//}


/**
 * 方式1: 通过接口实现依赖传递
 */
//interface IOPenAndClose {
//    public void open(ITV itv);
//}
//
//interface ITV {
//    public void play();
//}
//

//
//class OpenAndClose implements IOPenAndClose {
//
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

