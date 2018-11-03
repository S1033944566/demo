package com.baozun.demo.validate;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @description: 用于校验发送JNE的参数合法性
 * @author: Rover Wang
 * @date: 2018/10/31 17:54
 */
public class ValidateShipmentDataRequestUtil {

    private static final Logger logger = LoggerFactory.getLogger(ValidateShipmentDataRequestUtil.class);

    private static boolean flag = Boolean.TRUE;

    public static void validateProperties(Map<String, String> paramMap) throws BusinessException {

        JSONObject map2JsonObject = JSONObject.fromObject(paramMap);

        JSONObject jsonObject = JSONObject.fromObject(map2JsonObject.toString());

        Request2JNEParam request2JNEParam = (Request2JNEParam) JSONObject.toBean(jsonObject, Request2JNEParam.class);

        if (request2JNEParam.getPICKUP_NAME() != null && request2JNEParam.getPICKUP_NAME().getBytes().length > 50) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_NAME:request max length:50,actual:" + request2JNEParam.getPICKUP_NAME().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_TIME() != null && request2JNEParam.getPICKUP_NAME().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_TIME:request max length:30,actual:" + request2JNEParam.getPICKUP_TIME().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_PIC() != null && request2JNEParam.getPICKUP_PIC().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_PIC:request max length:30,actual:" + request2JNEParam.getPICKUP_PIC().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_PIC_PHONE() != null && request2JNEParam.getPICKUP_PIC_PHONE().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_PIC_PHONE:request max length:30,actual:" + request2JNEParam.getPICKUP_PIC_PHONE().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_ADDRESS() != null && request2JNEParam.getPICKUP_ADDRESS().getBytes().length > 300) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_ADDRESS:request max length:300,actual:" + request2JNEParam.getPICKUP_ADDRESS().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_DISTRICT() != null && request2JNEParam.getPICKUP_DISTRICT().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_DISTRICT:request max length:30,actual:" + request2JNEParam.getPICKUP_DISTRICT().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_CITY() != null && request2JNEParam.getPICKUP_CITY().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_CITY:request max length:30,actual:" + request2JNEParam.getPICKUP_CITY().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_SERVICE() != null && request2JNEParam.getPICKUP_SERVICE().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_SERVICE:request max length:30,actual:" + request2JNEParam.getPICKUP_SERVICE().getBytes().length);
        }
        if (request2JNEParam.getPICKUP_VEHICLE() != null && request2JNEParam.getPICKUP_VEHICLE().getBytes().length > 100) {
            flag = Boolean.FALSE;
            logger.error("PICKUP_VEHICLE:request max length:,actual:100" + request2JNEParam.getPICKUP_VEHICLE().getBytes().length);
        }
        if (request2JNEParam.getBRANCH() != null && request2JNEParam.getBRANCH().getBytes().length > 6) {
            flag = Boolean.FALSE;
            logger.error("BRANCH:request max length:6,actual:" + request2JNEParam.getBRANCH().getBytes().length);
        }
        if (request2JNEParam.getCUST_ID() != null && request2JNEParam.getCUST_ID().getBytes().length > 10) {
            flag = Boolean.FALSE;
            logger.error("CUST_ID:request max length:10,actual:" + request2JNEParam.getCUST_ID().getBytes().length);
        }
        if (request2JNEParam.getORDER_ID() != null && request2JNEParam.getORDER_ID().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("ORDER_ID:request max length:20,actual:" + request2JNEParam.getORDER_ID().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_ADDR1() != null && request2JNEParam.getSHIPPER_ADDR1().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_ADDR1:request max length:30,actual:" + request2JNEParam.getSHIPPER_ADDR1().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_ADDR2() != null && request2JNEParam.getSHIPPER_ADDR2().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_ADDR1:request max length:30,actual:" + request2JNEParam.getSHIPPER_ADDR2().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_ADDR3() != null && request2JNEParam.getSHIPPER_ADDR3().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_ADDR1:request max length:30,actual:" + request2JNEParam.getSHIPPER_ADDR3().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_NAME() != null && request2JNEParam.getSHIPPER_NAME().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_NAME:request max length:30,actual:" + request2JNEParam.getSHIPPER_NAME().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_CITY() != null && request2JNEParam.getSHIPPER_CITY().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_CITY:request max length:20,actual:" + request2JNEParam.getSHIPPER_CITY().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_ZIP() != null && request2JNEParam.getSHIPPER_ZIP().getBytes().length > 5) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_ZIP:request max length:5,actual:" + request2JNEParam.getSHIPPER_ZIP().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_REGION() != null && request2JNEParam.getSHIPPER_REGION().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_REGION:request max length:20,actual:" + request2JNEParam.getSHIPPER_REGION().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_COUNTRY() != null && request2JNEParam.getSHIPPER_COUNTRY().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_COUNTRY:request max length:20,actual:" + request2JNEParam.getSHIPPER_COUNTRY().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_CONTACT() != null && request2JNEParam.getSHIPPER_CONTACT().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_CONTACT:request max length:20,actual:" + request2JNEParam.getSHIPPER_CONTACT().getBytes().length);
        }
        if (request2JNEParam.getSHIPPER_PHONE() != null && request2JNEParam.getSHIPPER_PHONE().getBytes().length > 15) {
            flag = Boolean.FALSE;
            logger.error("SHIPPER_PHONE:request max length:15,actual:" + request2JNEParam.getSHIPPER_PHONE().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_NAME() != null && request2JNEParam.getRECEIVER_NAME().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_NAME:request max length:30,actual:" + request2JNEParam.getRECEIVER_NAME().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_ADDR1() != null && request2JNEParam.getRECEIVER_ADDR1().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_ADDR1:request max length:30,actual:" + request2JNEParam.getRECEIVER_ADDR1().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_ADDR2() != null && request2JNEParam.getRECEIVER_ADDR2().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_ADDR2:request max length:30,actual:" + request2JNEParam.getRECEIVER_ADDR2().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_ADDR3() != null && request2JNEParam.getRECEIVER_ADDR3().getBytes().length > 30) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_ADDR3:request max length:30,actual:" + request2JNEParam.getRECEIVER_ADDR3().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_CITY() != null && request2JNEParam.getRECEIVER_CITY().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_CITY:request max length:20,actual:" + request2JNEParam.getRECEIVER_CITY().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_ZIP() != null && request2JNEParam.getRECEIVER_ZIP().getBytes().length > 5) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_ZIP:request max length:5,actual:" + request2JNEParam.getRECEIVER_ZIP().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_REGION() != null && request2JNEParam.getRECEIVER_REGION().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_REGION:request max length:20,actual:" + request2JNEParam.getRECEIVER_REGION().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_COUNTRY() != null && request2JNEParam.getRECEIVER_COUNTRY().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_COUNTRY:request max length:20,actual:" + request2JNEParam.getRECEIVER_COUNTRY().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_CONTACT() != null && request2JNEParam.getRECEIVER_CONTACT().getBytes().length > 20) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_CONTACT:request max length:20,actual:" + request2JNEParam.getRECEIVER_CONTACT().getBytes().length);
        }
        if (request2JNEParam.getRECEIVER_PHONE() != null && request2JNEParam.getRECEIVER_PHONE().getBytes().length > 15) {
            flag = Boolean.FALSE;
            logger.error("RECEIVER_PHONE:request max length:15,actual:" + request2JNEParam.getRECEIVER_PHONE().getBytes().length);
        }
        if (request2JNEParam.getORIGIN_CODE() != null && request2JNEParam.getORIGIN_CODE().getBytes().length > 10) {
            flag = Boolean.FALSE;
            logger.error("ORIGIN_CODE:request max length:10,actual:" + request2JNEParam.getORIGIN_CODE().getBytes().length);
        }
        if (request2JNEParam.getDESTINATION_CODE() != null && request2JNEParam.getDESTINATION_CODE().getBytes().length > 10) {
            flag = Boolean.FALSE;
            logger.error("DESTINATION_CODE:request max length:10,actual:" + request2JNEParam.getDESTINATION_CODE().getBytes().length);
        }
        if (request2JNEParam.getSERVICE_CODE() != null && request2JNEParam.getSERVICE_CODE().getBytes().length > 10) {
            flag = Boolean.FALSE;
            logger.error("SERVICE_CODE:request max length:10,actual:" + request2JNEParam.getSERVICE_CODE().getBytes().length);
        }
        if (request2JNEParam.getGOODS_DESC() != null && request2JNEParam.getGOODS_DESC().getBytes().length > 60) {
            flag = Boolean.FALSE;
            logger.error("GOODS_DESC:request max length:60,actual:" + request2JNEParam.getGOODS_DESC().getBytes().length);
        }
        if (request2JNEParam.getINSURANCE_FLAG() != null && request2JNEParam.getINSURANCE_FLAG().getBytes().length > 1) {
            flag = Boolean.FALSE;
            logger.error("INSURANCE_FLAG:request max length:1,actual:" + request2JNEParam.getINSURANCE_FLAG().getBytes().length);
        }
        if (request2JNEParam.getSPECIAL_INS() != null && request2JNEParam.getSPECIAL_INS().getBytes().length > 60) {
            flag = Boolean.FALSE;
            logger.error("SPECIAL_INS:request max length:60,actual:" + request2JNEParam.getSPECIAL_INS().getBytes().length);
        }
        if (request2JNEParam.getMERCHANT_ID() != null && request2JNEParam.getMERCHANT_ID().getBytes().length > 100) {
            flag = Boolean.FALSE;
            logger.error("MERCHANT_ID:request max length:100,actual:" + request2JNEParam.getMERCHANT_ID().getBytes().length);
        }
        if (request2JNEParam.getLAT() != null && request2JNEParam.getLAT().getBytes().length > 60) {
            flag = Boolean.FALSE;
            logger.error("LAT:request max length:60,actual:" + request2JNEParam.getLAT().getBytes().length);
        }
        if (request2JNEParam.getLON() != null && request2JNEParam.getLON().getBytes().length > 60) {
            flag = Boolean.FALSE;
            logger.error("LON:request max length:60,actual:" + request2JNEParam.getLON().getBytes().length);
        }
        if (request2JNEParam.getTYPE() != null && request2JNEParam.getTYPE().getBytes().length > 10) {
            flag = Boolean.FALSE;
            logger.error("TYPE:request max length:10,actual:" + request2JNEParam.getTYPE().getBytes().length);
        }
        if (request2JNEParam.getCOD_FLAG() != null && request2JNEParam.getCOD_FLAG().getBytes().length > 3) {
            flag = Boolean.FALSE;
            logger.error("COD_FLAG:request max length:3,actual:" + request2JNEParam.getCOD_FLAG().getBytes().length);
        }
        if (request2JNEParam.getAWB() != null && request2JNEParam.getAWB().getBytes().length > 16) {
            flag = Boolean.FALSE;
            logger.error("AWB:request max length:16,actual:" + request2JNEParam.getAWB().getBytes().length);
        }
        if (StringUtils.isNotBlank(request2JNEParam.getWEIGHT()) && !isReasonable(request2JNEParam.getWEIGHT())) {
            flag = Boolean.FALSE;
            logger.error("WEIGHT:request:NUMBER(10,3),actual:" + request2JNEParam.getWEIGHT());
        }
        if (StringUtils.isNotBlank(request2JNEParam.getQTY()) && !isReasonable(request2JNEParam.getQTY())) {
            flag = Boolean.FALSE;
            logger.error("QTY:request:NUMBER(10,3),actual:" + request2JNEParam.getQTY());
        }
        if (StringUtils.isNotBlank(request2JNEParam.getGOODS_AMOUNT()) && !isNum(request2JNEParam.getGOODS_AMOUNT())) {
            flag = Boolean.FALSE;
            logger.error("GOODS_AMOUNT:request:NUMBER,actual:" + request2JNEParam.getGOODS_AMOUNT());
        }
        if (StringUtils.isNotBlank(request2JNEParam.getCOD_AMOUNT()) && !isNum(request2JNEParam.getCOD_AMOUNT())) {
            flag = Boolean.FALSE;
            logger.error("COD_AMOUNT:request:NUMBER,actual:" + request2JNEParam.getCOD_AMOUNT());
        }

        if (!flag) {
            throw new BusinessException("fields' length out of range,please check it.");
        }
    }

    /**
     * 校验是否符合number(10, 3)
     * @param parameter
     * @return
     */
    private static boolean isReasonable(String parameter) {
        return Pattern.compile("^(\\d{0,7}\\.\\d{0,3})$").matcher(parameter).matches();
    }

    /**
     * 校验是否为 NUMBER
     * @param parameter
     * @return
     */
    private static boolean isNum(String parameter) {
        return Pattern.compile("^[0-9]*$").matcher(parameter).matches();
    }

}
