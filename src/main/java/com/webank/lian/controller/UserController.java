package com.webank.lian.controller;

import com.webank.lian.domain.AuthorizationRecord;
import com.webank.lian.domain.CompanyApplyRecord;
import com.webank.lian.service.AuthorizationRecordService;
import com.webank.lian.service.CompanyApplyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	CompanyApplyRecordService companyApplyRecordService;
	
	@Autowired
	AuthorizationRecordService authorizationRecordService;
	
	@RequestMapping(value = "/messages")
	public String getMessage(@RequestParam("identification") String identification,
	                         Model model) {
		List<CompanyApplyRecord> applyRecords
				= companyApplyRecordService.getCompanyApplyRecordsByPersonIdentification(identification);
		
		model.addAttribute("applyRecords", applyRecords);
		return "person_xiaoxi";
	}
	
	
	@RequestMapping(value = "/agree")
	@Transactional
	public void agreeAuthorization(@RequestParam("applyId") Integer applyId,
	                               @RequestParam("identification") String identification) {
		//插入新的授权记录
		Date now = new Date();
		AuthorizationRecord a = new AuthorizationRecord(0, applyId, 1, now, identification);
		authorizationRecordService.addAuthorizationRecord(a);
		
		//修改企业申请的状态为接受
		companyApplyRecordService.updateStatus(applyId, 2);
		
	}
	
	@RequestMapping(value = "/disagree")
	@Transactional
	public void disagreeAuthorization(@RequestParam("applyId") Integer applyId,
	                                  @RequestParam("identification") String identification) {
		//插入新的授权记录
		Date now = new Date();
		AuthorizationRecord a = new AuthorizationRecord(0, applyId, 0, now, identification);
		authorizationRecordService.addAuthorizationRecord(a);
		
		//修改企业申请的状态为拒绝
		companyApplyRecordService.updateStatus(applyId, 1);
	}
}
