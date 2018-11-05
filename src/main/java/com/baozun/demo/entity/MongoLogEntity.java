package com.baozun.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/11/5 16:19
 */
public class MongoLogEntity implements Serializable {

    /**
     * 序列号
     */
    private static final long serialVersionUID = -8795573304168185092L;

    private String updater;

    private String creater;

    /*
     * 操作类型
     */
    private String operationType;

    private Date updateDate;

    private Date createDate;

    /*
     * 保存到mongo中的集合名称
     */
    private String collection;

    /*
     * 保存的实体
     */
    private Object domain;

    public MongoLogEntity() {}

    public MongoLogEntity(Builder builder) {
        this.updater = builder.updater;
        this.creater = builder.creater;
        this.operationType = builder.operationType;
        this.updateDate = builder.updateDate;
        this.createDate = builder.createDate;
        this.collection = builder.collection;
        this.domain = builder.domain;
    }

    /**
     * 静态内部类用于代替构造器
     * @author: Rover Wang
     * @date: Nov 5, 2018 3:22:47 PM
     */
    public static class Builder {

        private String updater;

        private String creater;

        private String operationType;

        private Date updateDate;

        private Date createDate;

        private String collection;

        private Object domain;

        public Builder() {

        }

        public Builder updater(String updater) {
            this.updater = updater;
            return this;
        }

        public Builder creater(String creater) {
            this.creater = creater;
            return this;
        }

        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder updateDate(Date updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public Builder createDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }

        public Builder collection(String collection) {
            this.collection = collection;
            return this;
        }

        public Builder domain(Object domain) {
            this.domain = domain;
            return this;
        }

        public MongoLogEntity build() {
            return new MongoLogEntity(this);
        }

    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Object getDomain() {
        return domain;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "MongoLogEntity [updater=" + updater + ", creater=" + creater + ", operationType=" + operationType
                + ", updateDate=" + updateDate + ", createDate=" + createDate + ", collection=" + collection
                + ", domain=" + domain + "]";
    }

}
