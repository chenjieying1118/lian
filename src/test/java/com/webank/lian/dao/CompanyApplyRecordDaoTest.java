package com.webank.lian.dao;

import com.webank.lian.domain.CompanyApplyRecord;
import com.webank.lian.vo.CompanyApplyVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyApplyRecordDaoTest {
	
	@Autowired
	CompanyApplyRecordDao dao;
	
	@Test
	public void insert() {
		dao.insert(new CompanyApplyRecord(0, "123", "123", 1, new Date(), 0));
	}
	
	@Test
	public void updateStatus() {
		dao.updateStatus(2, 2);
	}
	
	@Test
	public void listCompanyVoByPersonIdentification() {
		List<CompanyApplyVo> vos = dao.listCompanyVoByPersonIdentificationAndStatus("123", 0);
		System.out.println(vos.get(0));
	}
	
}