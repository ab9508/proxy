package com.ab.command;

/**
 * @author ab
 * @description
 * @date
 */
public class TVOnCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    /**
     * 执行某个命令
     */
    @Override
    public void execute() {
        tvReceiver.on();
    }

    /**
     * 撤销某个命令
     */
    @Override
    public void undo() {
        tvReceiver.off();
    }
}
