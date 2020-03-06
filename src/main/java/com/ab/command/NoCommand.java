package com.ab.command;

/**
 * @author ab
 * @description 空执行, 用于初始化每个按钮,
 * 当调用空命令时,对象什么都不做,可以省掉对空的判断
 * @date
 */
public class NoCommand implements Command {
    /**
     * 执行某个命令
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销某个命令
     */
    @Override
    public void undo() {

    }
}
