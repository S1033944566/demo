package com.baozun.demo.task;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/18 16:04
 */
public enum ShoOutLetInfoAttribute {

    GETCH("Gtech"), NORMAL("NORMAL"), MAINCATEGORY("50011699"), STARTTIME("9:00"), ENDTIME("22:00"), ADMIN("admin"), BZ_SD("BZ_SD");

    private String name;

    private ShoOutLetInfoAttribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

