package com.minggo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.minggo.model.User;
import com.minggo.wikigenerator.APIDoc;

/**
 * 接口控制类
 * 
 * @author minggo
 */
@Controller

public class APIActions {

	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	@APIDoc(param={"username","password","option"}, paramDesc = { "用户名","密码","可选参数" }, title = "获取用户信息", url = "/getUserInfo")
	public String getUserInfo(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("option") String option) {

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		return new Gson().toJson(user);
	}

}
