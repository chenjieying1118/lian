package com.webank.lian.domain;

import java.util.Date;

public class AuthorizationRecord {
    private Integer id;

    private Integer applyId;

    private Integer result;

    private Date solveTime;

    private String personIdentification;
    
    public void setPersonIdentification(String personIdentification) {
        this.personIdentification = personIdentification;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthorizationRecord{");
        sb.append("id=").append(id);
        sb.append(", applyId=").append(applyId);
        sb.append(", result=").append(result);
        sb.append(", solveTime=").append(solveTime);
        sb.append(", personIdentification=").append(personIdentification);
        sb.append('}');
        return sb.toString();
    }
    
    public AuthorizationRecord(Integer id, Integer applyId, Integer result, Date solveTime, String  personIdentification) {
        this.id = id;
        this.applyId = applyId;
        this.result = result;
        this.solveTime = solveTime;
        this.personIdentification = personIdentification;
    }

    public AuthorizationRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getSolveTime() {
        return solveTime;
    }

    public void setSolveTime(Date solveTime) {
        this.solveTime = solveTime;
    }

    public String  getPersonIdentification() {
        return personIdentification;
    }
    
}