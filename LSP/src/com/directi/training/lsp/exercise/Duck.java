package com.directi.training.lsp.exercise;

public class Duck implements Iduck
{
    private boolean _on = true;
    @Override
    public void quack()
    {
        System.out.println("Quack...");
    }

    @Override
    public void swim()
    {
        System.out.println("Swim...");
    }

    boolean get_on() {
        return true ;
    }

    void set_on(boolean bool) {
         _on=true;
    }


}
