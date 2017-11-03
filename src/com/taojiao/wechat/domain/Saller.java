package com.taojiao.wechat.domain;

import java.util.Date;
public class Saller {
	private String id;

    private String factoryName;

    private String sallerName;

    private String sallerWechat;

    private String sallerPic;

    private String sallerTell;

    private String sallerPhone;

    private String serviceWechat;

    private String address;

    private String busLicense;

    private String eduLicense;

    private Integer state;

    private Date createTime;

    private Integer role;

    private Date createBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getSallerName() {
        return sallerName;
    }

    public void setSallerName(String sallerName) {
        this.sallerName = sallerName == null ? null : sallerName.trim();
    }

    public String getSallerWechat() {
        return sallerWechat;
    }

    public void setSallerWechat(String sallerWechat) {
        this.sallerWechat = sallerWechat == null ? null : sallerWechat.trim();
    }

    public String getSallerPic() {
        return sallerPic;
    }

    public void setSallerPic(String sallerPic) {
        this.sallerPic = sallerPic == null ? null : sallerPic.trim();
    }

    public String getSallerTell() {
        return sallerTell;
    }

    public void setSallerTell(String sallerTell) {
        this.sallerTell = sallerTell == null ? null : sallerTell.trim();
    }

    public String getSallerPhone() {
        return sallerPhone;
    }

    public void setSallerPhone(String sallerPhone) {
        this.sallerPhone = sallerPhone == null ? null : sallerPhone.trim();
    }

    public String getServiceWechat() {
        return serviceWechat;
    }

    public void setServiceWechat(String serviceWechat) {
        this.serviceWechat = serviceWechat == null ? null : serviceWechat.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBusLicense() {
        return busLicense;
    }

    public void setBusLicense(String busLicense) {
        this.busLicense = busLicense == null ? null : busLicense.trim();
    }

    public String getEduLicense() {
        return eduLicense;
    }

    public void setEduLicense(String eduLicense) {
        this.eduLicense = eduLicense == null ? null : eduLicense.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }
}
