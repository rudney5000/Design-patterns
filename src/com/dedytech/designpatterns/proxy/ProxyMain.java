package com.dedytech.designpatterns.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("all", "passw");

        try {
            commandExecutor.executeCommand("ls -a");
            commandExecutor.executeCommand("rm some folder");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
