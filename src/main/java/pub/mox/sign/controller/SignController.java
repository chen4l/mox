package pub.mox.sign.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller  
@RequestMapping("/sign") 
public class SignController {
	
	 
	 @RequestMapping("/signIn")
	 public String signIn(HttpServletRequest request,Model model){
	        return "sign/signin";  
	 }
}
