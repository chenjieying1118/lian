package com.webank.lian.domain;

import java.util.Date;

public class CompanyApplyRecord {
    private Integer id;

    private String companyIdentification;

    private String personIdentification;

    private Integer msgType;

    private Date applyDate;

    private Integer status;
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanyApplyRecord{");
        sb.append("id=").append(id);
        sb.append(", companyIdentification='").append(companyIdentification).append('\'');
        sb.append(", personIdentification='").append(personIdentification).append('\'');
        sb.append(", msgType=").append(msgType);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
    
    public CompanyApplyRecord(Integer id, String companyIdentification, String personIdentification, Integer msgType, Date applyDate, Integer status) {
        this.id = id;
        this.companyIdentification = companyIdentification;
        this.personIdentification = personIdentification;
        this.msgType = msgType;
        this.applyDate = applyDate;
        this.status = status;
    }

    public CompanyApplyRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyIdentification() {
        return companyIdentification;
    }

    public void setCompanyIdentification(String companyIdentification) {
        this.companyIdentification = companyIdentification;
    }

    public String getPersonIdentification() {
        return personIdentification;
    }

    public void setPersonIdentification(String personIdentification) {
        this.personIdentification = personIdentification;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}