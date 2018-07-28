package com.webank.lian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.webank.lian.domain.AuthorizationRecord;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AuthorizationRecordDao {
	
	int insert(@Param("authorizationRecord") AuthorizationRecord authorizationRecord);
	
	AuthorizationRecord getAuthorizationByApplyId(@Param("applyId") Integer applyId);
	
	List<AuthorizationRecord> getAuthorizationsByPersonIdentification(
			@Param("person_identification") String PersonIdentification);
}
