package com.baozun.demo.validate;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/31 15:31
 */
public class ShipmentDataRequest {

    /** Shopdog门店的编号 */
    private String pickup_agent_id;

    /** OMS订单标识*/
    private String omsOrderCode;

    /** 服务类型（非必填） */
    private String service_type_id;

    /** 详细地址1 */
    private String shipper_address1;

    /** 详细地址2 */
    private String shipper_address2;

    /** 发货人街道 */
    private String shipper_kelurahan;

    /** 发货人区 */
    private String shipper_kecamatan;

    /** 发货人城市 */
    private String shipper_city;

    /** 发货人国家 */
    private String shipper_state;

    /** 发货人邮编 */
    private String shipper_zip;

    /** 发货人电话 */
    private String shipper_phone;

    /** 一个物流单号有几个包裹 */
    private String tot_package;

    /** 包裹总重量（非必填） */
    private String tot_weight;

    /** jne api user name */
    private String userName_jne;

    /** jne api key */
    private String apikey_jne;

    /** jne api参数 */
    private String olshop_branch;

    /** jne api参数 */
    private String olshop_cust;

    /** 发货人名称 */
    private String shipper_name;

    /** 取货日期*/
    private String pickup_date;

    /** 取货时间 */
    private String pickup_time;

    /** 取货联系人 */
    private String pickup_pic;

    /** 取货联系人电话 */
    private String pickup_pic_phone;

    /** 取货地址 */
    private String pickup_address;

    /** 取货地区 */
    private String pickup_district;

    /** 取货城市 */
    private String pickup_city;

    /** 发货服务 */
    private String pickup_service;

    /** 发货工具 */
    private String pickup_vehicle;

    /** 发货商id */
    private String merchant_id;

    /** 发货地经度 */
    private String lat;

    /** 发货地纬度 */
    private String lon;

    public String getPickup_agent_id(){
        return pickup_agent_id;
    }

    public String getService_type_id(){
        return service_type_id;
    }

    public String getShipper_address1(){
        return shipper_address1;
    }

    public String getShipper_address2(){
        return shipper_address2;
    }

    public String getShipper_kelurahan(){
        return shipper_kelurahan;
    }

    public String getShipper_kecamatan(){
        return shipper_kecamatan;
    }

    public String getShipper_city(){
        return shipper_city;
    }

    public String getShipper_state(){
        return shipper_state;
    }

    public String getShipper_zip(){
        return shipper_zip;
    }

    public String getShipper_phone(){
        return shipper_phone;
    }

    public String getTot_package(){
        return tot_package;
    }

    public String getTot_weight(){
        return tot_weight;
    }

    public void setPickup_agent_id(String pickup_agent_id){
        this.pickup_agent_id = pickup_agent_id;
    }

    public void setService_type_id(String service_type_id){
        this.service_type_id = service_type_id;
    }

    public void setShipper_address1(String shipper_address1){
        this.shipper_address1 = shipper_address1;
    }

    public void setShipper_address2(String shipper_address2){
        this.shipper_address2 = shipper_address2;
    }

    public void setShipper_kelurahan(String shipper_kelurahan){
        this.shipper_kelurahan = shipper_kelurahan;
    }

    public void setShipper_kecamatan(String shipper_kecamatan){
        this.shipper_kecamatan = shipper_kecamatan;
    }

    public void setShipper_city(String shipper_city){
        this.shipper_city = shipper_city;
    }

    public void setShipper_state(String shipper_state){
        this.shipper_state = shipper_state;
    }

    public void setShipper_zip(String shipper_zip){
        this.shipper_zip = shipper_zip;
    }

    public void setShipper_phone(String shipper_phone){
        this.shipper_phone = shipper_phone;
    }

    public void setTot_package(String tot_package){
        this.tot_package = tot_package;
    }

    public void setTot_weight(String tot_weight){
        this.tot_weight = tot_weight;
    }

    public String getOmsOrderCode() {
        return omsOrderCode;
    }

    public void setOmsOrderCode(String omsOrderCode) {
        this.omsOrderCode = omsOrderCode;
    }

    public String getUserName_jne() {
        return userName_jne;
    }

    public void setUserName_jne(String userName_jne) {
        this.userName_jne = userName_jne;
    }

    public String getApikey_jne() {
        return apikey_jne;
    }

    public void setApikey_jne(String apikey_jne) {
        this.apikey_jne = apikey_jne;
    }

    public String getOlshop_branch() {
        return olshop_branch;
    }

    public void setOlshop_branch(String olshop_branch) {
        this.olshop_branch = olshop_branch;
    }

    public String getOlshop_cust() {
        return olshop_cust;
    }

    public void setOlshop_cust(String olshop_cust) {
        this.olshop_cust = olshop_cust;
    }

    public String getShipper_name() {
        return shipper_name;
    }

    public void setShipper_name(String shipper_name) {
        this.shipper_name = shipper_name;
    }

    public String getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(String pickup_date) {
        this.pickup_date = pickup_date;
    }

    public String getPickup_time() {
        return pickup_time;
    }

    public void setPickup_time(String pickup_time) {
        this.pickup_time = pickup_time;
    }

    public String getPickup_pic() {
        return pickup_pic;
    }

    public void setPickup_pic(String pickup_pic) {
        this.pickup_pic = pickup_pic;
    }

    public String getPickup_pic_phone() {
        return pickup_pic_phone;
    }

    public void setPickup_pic_phone(String pickup_pic_phone) {
        this.pickup_pic_phone = pickup_pic_phone;
    }

    public String getPickup_address() {
        return pickup_address;
    }

    public void setPickup_address(String pickup_address) {
        this.pickup_address = pickup_address;
    }

    public String getPickup_district() {
        return pickup_district;
    }

    public void setPickup_district(String pickup_district) {
        this.pickup_district = pickup_district;
    }

    public String getPickup_city() {
        return pickup_city;
    }

    public void setPickup_city(String pickup_city) {
        this.pickup_city = pickup_city;
    }

    public String getPickup_service() {
        return pickup_service;
    }

    public void setPickup_service(String pickup_service) {
        this.pickup_service = pickup_service;
    }

    public String getPickup_vehicle() {
        return pickup_vehicle;
    }

    public void setPickup_vehicle(String pickup_vehicle) {
        this.pickup_vehicle = pickup_vehicle;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
