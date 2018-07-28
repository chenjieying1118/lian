package com.webank.lian.vo;

import com.webank.lian.domain.CompanyApplyRecord;

public class CompanyApplyVo extends CompanyApplyRecord {
	private String companyName;
	private String msgTypeStr;
	
	public String getMsgTypeStr() {
		return msgTypeStr;
	}
	
	public void setMsgTypeStr(String msgTypeStr) {
		this.msgTypeStr = msgTypeStr;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
