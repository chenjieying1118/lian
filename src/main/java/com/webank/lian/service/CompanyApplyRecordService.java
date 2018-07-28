package com.webank.lian.service;

import com.webank.lian.dao.CompanyApplyRecordDao;
import com.webank.lian.domain.CompanyApplyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyApplyRecordService {
	
	@Autowired
	CompanyApplyRecordDao companyApplyRecordDao;
	
	public List<CompanyApplyRecord> getCompanyApplyRecordsByPersonIdentification(String identification) {
		return companyApplyRecordDao.getCompanyApplyRecordsByPersonIdentification(identification);
	}
	
	public int addCompanyApplyRecord(CompanyApplyRecord companyApplyRecord) {
		return companyApplyRecordDao.insert(companyApplyRecord);
	}
	
	public int updateStatus(Integer companyApplyRecordId, Integer status) {
		return companyApplyRecordDao.updateStatus(companyApplyRecordId, status);
	}
}
