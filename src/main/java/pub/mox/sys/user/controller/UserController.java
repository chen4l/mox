package pub.mox.sys.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pub.mox.sys.user.pojo.User;
import pub.mox.sys.user.service.IUserService;

@Controller  
@RequestMapping("/user") 
public class UserController {
	
	 @Autowired
	 private IUserService userService; 
	 
	 @RequestMapping("/showUser")
	 public String toIndex(HttpServletRequest request,Model model){
		 	User user=userService.getUserById(1);
		 	model.addAttribute("user", user);
	        return "user/userList";  
	 }
}
