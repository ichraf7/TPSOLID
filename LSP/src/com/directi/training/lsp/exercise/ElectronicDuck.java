package com.directi.training.lsp.exercise;

public class ElectronicDuck implements Iduck
{
    private boolean _on = false;

    @Override
    public void quack() {
        if (get_on()) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (get_on()) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    @Override
    boolean get_on() {
        return true ;
    }

    @Override
    void set_on(boolean bool) {
        _on=true;
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
