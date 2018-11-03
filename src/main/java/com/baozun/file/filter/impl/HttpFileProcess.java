package com.baozun.file.filter.impl;

import com.baozun.file.filter.FileProcess;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/29 10:09
 */
public class HttpFileProcess implements FileProcess {

    /**
     * 剔除超链接的字数
     * @param msg
     */
    @Override
    public String process(String msg) {
        return msg.replaceAll(
                "^((https|http|ftp|rtsp|mms)?:\\/\\/)[^\\s]+"
                , "");
    }


    public static void main(String[] args) {
        String msg = "https://mp.weixin.q882b20cd";

        HttpFileProcess httpFileProcess = new HttpFileProcess();

        LinebreakProcess linebreakProcess = new LinebreakProcess();

        System.out.println(httpFileProcess.process(msg));
    }



}
