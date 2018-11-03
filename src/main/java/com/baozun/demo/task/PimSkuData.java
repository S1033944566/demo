package com.baozun.demo.task;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/16 12:16
 */
public class PimSkuData {

    private List<String> pimSku;

    private String requestId;

    private String shopId;

    private Date time;

    private Integer isSend;

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getPimSku() {
        return pimSku;
    }

    public void setPimSku(List<String> pimSku) {
        this.pimSku = pimSku;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    @Override
    public String toString() {
        return "PimSkuData{" +
                "pimSku='" + pimSku + '\'' +
                ", requestId='" + requestId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", time=" + time +
                ", isSend=" + isSend +
                '}';
    }
}
