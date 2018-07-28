package com.webank.lian.dao;

import com.webank.lian.domain.CompanyApplyRecord;
import com.webank.lian.vo.CompanyApplyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyApplyRecordDao {
	
	int insert(@Param("companyApplyRecord") CompanyApplyRecord companyApplyRecord);
	
	int updateStatus(@Param("id") Integer applyId,
	                 @Param("status") Integer status);
	
	List<CompanyApplyVo> listCompanyVoByPersonIdentificationAndStatus(
			@Param("pid") String pid, @Param("status") Integer status);
	
	List<CompanyApplyVo> listCompanyVoByCompanyIdentificationAndStatus(
			@Param("cid") String cid, @Param("status") Integer status);
}
