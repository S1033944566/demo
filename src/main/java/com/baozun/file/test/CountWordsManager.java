package com.baozun.file.test;

import com.baozun.file.filter.FileProcess;
import com.baozun.file.filter.impl.HttpFileProcess;
import com.baozun.file.filter.impl.LinebreakProcess;
import com.baozun.file.readfile.CountWords;
import com.baozun.file.readfile.ReadFile;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: 单线程统计字数
 * @author: Rover Wang
 * @date: 2018/10/29 10:29
 */
public class CountWordsManager {

    private HttpFileProcess httpFileProcess = new HttpFileProcess();

    private LinebreakProcess linebreakProcess = new LinebreakProcess();

    private List<FileProcess> processList = new ArrayList<>();

    private CountWordsManager addProcess(FileProcess fileProcess) {
        processList.add(fileProcess);
        return this;
    }


    @Test
    public void test1() throws Exception {
        System.out.println(getWords("E://test"));
    }

    /**
     * 統計字數
     * @param directory
     * @return
     * @throws IOException
     */
    public int getWords(String directory) throws IOException {
        List<String> fileList = ReadFile.getFilesPath(directory);

        addProcess(httpFileProcess).addProcess(linebreakProcess);

        for (String path : fileList) {
            Stream<String> stringStream = Files.lines(Paths.get(new File(path).toURI()), StandardCharsets.UTF_8);

            List<String> stringList = stringStream.collect(Collectors.toList());

            for (String str: stringList) {
                doFilter(str);
                CountWords.sum(str.toCharArray().length);
            }
        }
        return CountWords.getTotalNum();
    }

    /**
     * 过滤
     * @param msg
     * @return
     */
    private String doFilter(String msg) {
        for (FileProcess fileProcess : processList) {
            fileProcess.process(msg);
        }
        return msg;
    }
}
