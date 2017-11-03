package com.taojiao.wechat.controller.saller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taojiao.wechat.controller.BaseController;
import com.taojiao.wechat.domain.Saller;
import com.taojiao.wechat.service.SallerService;
@Controller
public class SallerController extends BaseController {
	@Resource
	SallerService sallerService;
	@RequestMapping("saller/index.do")
	public String index(){
		return "/index.jsp";
	}
	@RequestMapping("/saller/get.do")
	public String get(Model model){
		Saller saller = sallerService.get(2);
		model.addAttribute("saller",saller);
		return "/index.jsp";
	}
	

}
