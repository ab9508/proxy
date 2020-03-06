package com.ab.command;

/**
 * @author ab
 * @description 命令接口
 * @date
 */
public interface Command {
    /**
     * 执行某个命令
     */
    public void execute();

    /**
     * 撤销某个命令
     */
    public void undo();

}
