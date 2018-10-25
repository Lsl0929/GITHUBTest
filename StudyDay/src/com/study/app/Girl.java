package com.study.app;

/**
 * @author 梁世龙
 * @create 2018-10-23 16:20
 */
public class Girl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shot(Boy boy){
        System.out.println("ok"+boy.getName());
    }
}
