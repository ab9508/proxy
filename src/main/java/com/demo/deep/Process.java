package com.demo.deep;

/**
 * @author ab
 * @description
 * @date
 */
public abstract class Process {
    /**
     * 下一个处理者
     */
    Process process = null;

    public abstract void process(DeepRequest request);

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
}
