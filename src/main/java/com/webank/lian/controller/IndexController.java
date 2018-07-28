package com.webank.lian.controller;

import com.webank.lian.domain.AuthorizationRecord;
import com.webank.lian.domain.Company;
import com.webank.lian.domain.User;
import com.webank.lian.service.AuthorizationRecordService;
import com.webank.lian.service.CompanyApplyRecordService;
import com.webank.lian.service.CompanyService;
import com.webank.lian.service.UserService;
import com.webank.lian.vo.CompanyApplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	AuthorizationRecordService authorizationRecordService;
	
	@Autowired
	CompanyApplyRecordService companyApplyRecordService;
	
	@RequestMapping(value = "/user/{identification}")
	public String userIndex(@PathVariable(name = "identification") String identification,
	                        Model model) {
		
		User user = userService.getUserByIdentification(identification);
		model.addAttribute("user", user);
		
		//获取已经被批准的申请（状态为2）
		List<CompanyApplyVo> applyRecords
				= companyApplyRecordService.listCompanyVoByPersonIdentificationAndStatus(identification, 2);
		
		for (CompanyApplyVo vo : applyRecords) {
			if (vo.getMsgType() == 0) {
				vo.setMsgTypeStr("学历");
			} else if (vo.getMsgType() == 1) {
				vo.setMsgTypeStr("银行流水");
			} else if (vo.getMsgType() == 2) {
				vo.setMsgTypeStr("户籍");
			}
		}
		
		model.addAttribute("records", applyRecords);
		
		return "user_index";
	}
	
	@RequestMapping(value = "/company/{companyId}")
	public String comIndex(@PathVariable(name = "companyId") Integer companyId,
	                       Model model) {
		
		Company company = companyService.getCompanyById(companyId);
		
		model.addAttribute("company", company);
		
		
		return "com_index";
	}
}
