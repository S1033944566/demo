package com.baozun.demo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;
import net.sf.json.JSONObject;

/**
 * @description: 定时任务
 * @author: Rover Wang
 * @date: 2018/10/16 15:44
 */
@Component
public class SchedulerTask {

    @Value("${spring.data.mongodb.cron}")
    private String cron;

    @Autowired
    private MongoTemplate mongoTemplate;




    //@Scheduled(cron="*/5 * * * * ?")
    /*private void process(){

        Query query = new Query();
        query.addCriteria(Criteria.where("isSend").is(0)).addCriteria(Criteria.where("time").lt(new Date()));

        List<PimSkuData> list = mongoTemplate.find(query, PimSkuData.class, "product_pimsku2pim_2018");
        System.out.println(list);

        for (PimSkuData pimSku : list) {
            if (pimSku.getCount() > 2) {
                continue;
            }
            JSONObject json = JSONObject.fromObject(pimSku);

            System.out.println("json.toString():" + json.toString());
            String requestId = pimSku.getRequestId();
            Query queryUpdate = new Query();

            queryUpdate.addCriteria(Criteria.where("requestId").is(requestId));
            Update update = new Update().set("isSend", 1).set("time", new Date()).set("count", pimSku.getCount() + 1);

            mongoTemplate.updateMulti(queryUpdate, update, "product_pimsku2pim_2018");
        }

    }*/

    //@Scheduled(cron="*/5 * * * * ?")
    /*public void testSql() {

        Query queryUpdate = new Query();
        queryUpdate.addCriteria(Criteria.where("requestId").is("089i8764"));
        Update update = new Update().set("isSend", 1).set("time", new Date()).set("count", 1);

        mongoTemplate.updateMulti(queryUpdate, update, "product_pimsku2pim_2018");

    }*/

}
