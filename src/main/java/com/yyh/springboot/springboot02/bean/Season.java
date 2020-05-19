package com.yyh.springboot.springboot02.bean;

public enum Season {
    CHUN(1,"chun"),XIA(2,"xia");
    private int num;
    private String name;
    private Season(int num,String name){   //要私有的构造方法 有值的枚举类必须要属性值和带参构造方法
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
