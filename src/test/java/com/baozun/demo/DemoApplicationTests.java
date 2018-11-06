package com.baozun.demo;

import com.baozun.demo.task.PimSkuData;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private MongoOperations mongoOperations;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMongo() {

		/*PimSkuData data = new PimSkuData();
		List<String> pimSku = new ArrayList<String>();
        String str = "{\"requestId\":\"PIM-5baf340e05f95\",\"shopId\":\"TBILSTORE11\",\"pimSku\":[\"0900-MSS110-T00Z00A01\", \"0901-MSS110-T00Z00A01\", \"0902-MSS110-T00Z00A01\"],\"code\":0,\"msg\":\"\"}";

        Object paramJson = JSON.parse(str);
        JSONObject paramResult = JSONObject.fromObject(paramJson);

        for (String s : paramResult.getString("pimSku").substring(1, paramResult.getString("pimSku").length() - 1).split(",")) {
            pimSku.add(s.replaceAll("\"", ""));
        }

		List<PimSkuData> dataList = new ArrayList<PimSkuData>();*/
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("createTime", new Date());
		basicDBObject.put("updateTime", null);
		basicDBObject.put("isSend", 0);
		basicDBObject.put("requestId", "089i8764");
		basicDBObject.put("shopId", "nebulashop");
		basicDBObject.put("pimSku", new ArrayList<String>());
		basicDBObject.put("count", 0);

		mongoOperations.insert(basicDBObject, "table");

		int num = 1 / 0;

		/**
		 * Query queryUpdate = new Query();

		 queryUpdate.addCriteria(Criteria.where("requestId").is(requestId));
		 Update update = new Update().set("isSend", 1).set("time", new Date()).set("count", pimSku.getCount() + 1);
		 */
		Query query = new Query();
		query.addCriteria(Criteria.where("requestId").is("089i8764"));
		Update update = new Update();
		update.set("shopId", "1231234").set("pimSku", "0000000");
		mongoOperations.updateMulti(query, update, "table");

//		mongoOperations.updateMulti(null, null, null)
	}

	@Test
	public void testCount() {
        Query query = new Query();
        query.addCriteria(Criteria.where("isSend").is(0)/*.addCriteria(Criteria.where("time").lt(new Date())*/);

        List<PimSkuData> list = mongoTemplate.find(query, PimSkuData.class, "product_pimsku2pim_2018");
        System.out.println(list.size());

        for (PimSkuData pimSku : list) {
            if (pimSku.getCount() > 2) {
                continue;
            }
            JSONObject json = JSONObject.fromObject(list.get(0));

            System.out.println("json.toString():/n" + json.toString());
            String requestId = pimSku.getRequestId();
            Query queryUpdate = new Query();

            queryUpdate.addCriteria(Criteria.where("requestId").is(requestId));
            Update update = new Update().set("isSend", 1).set("time", new Date()).set("count", pimSku.getCount() + 1);

            mongoTemplate.updateMulti(queryUpdate, update, "product_pimsku2pim_2018");
        }

		//mongoTemplate.getCollection("").

    }

}



