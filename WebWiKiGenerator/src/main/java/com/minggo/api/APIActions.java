package com.minggo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.minggo.model.User;

/**
 * 接口控制类
 * @author minggo
 */
@Controller
public class APIActions {
	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public String getUserInfo(@RequestParam("username") String username,@RequestParam("password") String password){
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		return new Gson().toJson(user); 
	}
	
}
