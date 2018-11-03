package com.baozun.demo.validate;

import java.util.*;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/31 17:13
 */
public class TestDemo {

    public static void main(String[] args) throws BusinessException {

        Request2JNEParam request2JNEParam = new Request2JNEParam();

        Map<String, String> params = new HashMap<String, String>();

        params.put("QTY", "5555.9");
        params.put("COD_FLAG", "222");
        params.put("GOODS_AMOUNT", "");
        params.put("INSURANCE_FLAG", "22");
        params.put("RECEIVER_CONTACT", null);
        params.put("", "");



        ValidateShipmentDataRequestUtil.validateProperties(params);

        System.out.println("end---------");
    }
}
