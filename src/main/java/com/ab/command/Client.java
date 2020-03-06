package com.ab.command;

/**
 * @author ab
 * @description
 * @date
 */
public class Client {
    public static void main(String[] args) {
        //使用命令模式,完成通过要控器对电灯的操作

        //创建电灯的对象(接收者)
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置相关命令,on=0是电灯的开关操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        //开灯
        System.out.println("开灯按钮");
        remoteController.onButtonWasPushed(0);
        //关灯
        remoteController.offButtonWasPushed(0);
        System.out.println("关灯按钮");
        //撤销
        System.out.println("撤销按钮");
        remoteController.undoButtonWasPushed();

        System.out.println("===");
        //创建电视对象
        TVReceiver tvReceiver = new TVReceiver();
        //创建电视的相关命令
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        //给遥控器设置命令
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        //开电视
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();


    }
}
