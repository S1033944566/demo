package com.baozun.file.readfile;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/29 10:14
 */
public class ReadFile {


    private static List<String> fileList = new ArrayList<>();


    public static List<String> getFilesPath(String directory) {
        File file = new File(directory);
        File[] files = file.listFiles();

        for (File i : files) {
            if (i.isFile()) {
                fileList.add(i.getPath());
            } else {
                getFilesPath(i.getPath());
            }
        }
        return fileList;
    }

}
