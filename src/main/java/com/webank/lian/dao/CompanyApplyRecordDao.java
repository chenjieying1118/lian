package com.webank.lian.dao;

import com.webank.lian.domain.CompanyApplyRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyApplyRecordDao {
	
	int insert(@Param("companyApplyRecord") CompanyApplyRecord companyApplyRecord);
	
	int updateStatus(@Param("companyApplyRecordId") Integer companyApplyRecordId,
	                 @Param("status") Integer status);
	
	List<CompanyApplyRecord> getCompanyApplyRecordsByPersonIdentification(
			@Param("identification") String identification);
}
