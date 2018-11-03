package com.baozun.file.filter.impl;

import com.baozun.file.filter.FileProcess;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/29 10:12
 */
public class LinebreakProcess implements FileProcess {

    /**
     * 剔除换行
     * @param msg
     * @return
     */
    @Override
    public String process(String msg) {
        return msg.replaceAll("\\s*", "");
    }
}
