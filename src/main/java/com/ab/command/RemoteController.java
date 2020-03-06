package com.ab.command;

/**
 * @author ab
 * @description
 * @date
 */
public class RemoteController {
    /**
     * 开按钮的命令数组
     */
    Command[] onCommands;
    /**
     * 关按钮的命令数组
     */
    Command[] offCommands;

    /**
     * 执行撤销的命令
     */
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 打开按钮
     */
    public void onButtonWasPushed(int no) {
        //找到按下的按钮,并调用方法
        onCommands[no].execute();
        //记录此次操作,用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 关闭按钮
     */
    public void offButtonWasPushed(int off) {
        //找到按下的暗流,并调用方法
        offCommands[off].execute();
        //记录此处操作,用于撤销
        undoCommand = offCommands[off];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }


}
