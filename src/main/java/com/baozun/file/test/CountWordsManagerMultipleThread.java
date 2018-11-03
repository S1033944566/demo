package com.baozun.file.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/29 13:59
 */
public class CountWordsManagerMultipleThread {

    private static ExecutorService executorService;

    public static void main(String[] args) throws InterruptedException {
        executorService = Executors.newFixedThreadPool(10);


        /*
         * 等所有已提交的任务（包括正在跑的和队列中等待的）执行完
         * 或者等超时时间到
         * 或者线程被中断，抛出InterruptedException
         */
        executorService.awaitTermination(1000, TimeUnit.SECONDS);

    }

}
