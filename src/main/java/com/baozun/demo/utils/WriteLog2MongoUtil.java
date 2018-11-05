package com.baozun.demo.utils;

import com.baozun.demo.entity.MongoLogEntity;
import com.mongodb.BasicDBObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/5 16:18
 */
public class WriteLog2MongoUtil {

    private static final Logger logger = LoggerFactory.getLogger(WriteLog2MongoUtil.class);

    public static void writeLog2Mongo(MongoLogEntity mongoLogEntity, MongoOperations mongoOperations) {
        try {
            logger.info(String.format("write %s log to %s start-----------", mongoLogEntity.getOperationType(), mongoLogEntity.getCollection()));

            BasicDBObject basicDBObject = new BasicDBObject();
            basicDBObject.put("updater", mongoLogEntity.getUpdater());
            basicDBObject.put("updateDate", mongoLogEntity.getUpdateDate());
            basicDBObject.put("creater", mongoLogEntity.getCreater());
            basicDBObject.put("createDate", mongoLogEntity.getCreateDate());
            basicDBObject.put("operationType", mongoLogEntity.getOperationType());
            basicDBObject.put("domain", mongoLogEntity.getDomain());

            mongoOperations.insert(basicDBObject, mongoLogEntity.getCollection());
            logger.info(String.format("write %s log to %s end。。。。。。。", mongoLogEntity.getOperationType(), mongoLogEntity.getCollection()));
        } catch (Exception e) {
            logger.error(String.format("write %s log failed.", mongoLogEntity.getOperationType()), e.getMessage());
            e.printStackTrace();
        }

    }
}
