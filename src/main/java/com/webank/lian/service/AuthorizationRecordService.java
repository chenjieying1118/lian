package com.webank.lian.service;

import com.webank.lian.dao.AuthorizationRecordDao;
import com.webank.lian.domain.AuthorizationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationRecordService {
	
	@Autowired
	AuthorizationRecordDao authorizationRecordDao;
	
	public int addAuthorizationRecord(AuthorizationRecord authorizationRecord) {
		return authorizationRecordDao.insert(authorizationRecord);
	}
	
	public AuthorizationRecord getAuthorizationByApplyId(Integer applyId) {
		return authorizationRecordDao.getAuthorizationByApplyId(applyId);
	}
	
	public List<AuthorizationRecord> getAuthorizationsByPersonIdentification(
			String PersonIdentification) {
		return authorizationRecordDao.getAuthorizationsByPersonIdentification(PersonIdentification);
	}
}
