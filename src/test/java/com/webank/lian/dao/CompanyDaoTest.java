package com.webank.lian.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTest {
	
	@Autowired
	CompanyDao companyDao;
	
	@Test
	public void getCompanyByIdentification() {
		System.out.println(companyDao.getCompanyByIdentification("123"));
	}
	
	@Test
	public void getCompanyById() {
		System.out.println(companyDao.getCompanyById(1));
	}
}