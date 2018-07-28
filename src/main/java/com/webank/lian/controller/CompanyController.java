package com.webank.lian.controller;

import com.webank.lian.domain.AuthorizationRecord;
import com.webank.lian.service.AuthorizationRecordService;
import com.webank.lian.service.CompanyApplyRecordService;
import com.webank.lian.vo.CompanyApplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {
	
	@Autowired
	CompanyApplyRecordService companyApplyRecordService;
	
	@Autowired
	AuthorizationRecordService authorizationRecordService;
	
	@RequestMapping(value = "/messages")
	public String getMessage(@RequestParam("identification") String identification,
	                         Model model) {
		return "";
	}
	
	
}
