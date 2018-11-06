package com.baozun.demo.test;

import com.baozun.demo.entity.MongoLogEntity;
import com.baozun.demo.utils.WriteLog2MongoUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMogo {

    @Autowired
    private MongoOperations mongoOperations;
    @Test
    public void test1(){
        MongoLogEntity mongoLogEntity = new MongoLogEntity.Builder().createDate(new Date()).creater("").updateDate(null).updater("").operationType("add").domain(new ArrayList<String>()).collection("testorderstatus").build();
        WriteLog2MongoUtil.writeLog2Mongo(mongoLogEntity, mongoOperations);
    }
}
