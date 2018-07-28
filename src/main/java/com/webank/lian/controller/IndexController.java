package com.webank.lian.controller;

import com.webank.lian.domain.AuthorizationRecord;
import com.webank.lian.domain.Company;
import com.webank.lian.domain.User;
import com.webank.lian.service.AuthorizationRecordService;
import com.webank.lian.service.CompanyService;
import com.webank.lian.service.UserService;
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
	
	@RequestMapping(value = "/user/{userId}")
	public String userIndex(@PathVariable(name = "userId") Integer userId,
	                        Model model) {
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		
		List<AuthorizationRecord> authorizationRecords =
				authorizationRecordService.getAuthorizationsByPersonIdentification(
						user.getIdentification());
		model.addAttribute("authorizationRecords", authorizationRecords);
		
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
