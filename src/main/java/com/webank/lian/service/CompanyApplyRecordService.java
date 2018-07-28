package com.webank.lian.service;

import com.webank.lian.dao.CompanyApplyRecordDao;
import com.webank.lian.domain.CompanyApplyRecord;
import com.webank.lian.vo.CompanyApplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyApplyRecordService {
	
	@Autowired
	CompanyApplyRecordDao companyApplyRecordDao;
	
	public List<CompanyApplyVo> listCompanyVoByPersonIdentificationAndStatus(String identification, Integer status) {
		return companyApplyRecordDao.listCompanyVoByPersonIdentificationAndStatus(identification, status);
	}
	
	public int addCompanyApplyRecord(CompanyApplyRecord companyApplyRecord) {
		return companyApplyRecordDao.insert(companyApplyRecord);
	}
	
	public int updateStatus(Integer applyId, Integer status) {
		return companyApplyRecordDao.updateStatus(applyId, status);
	}
}
