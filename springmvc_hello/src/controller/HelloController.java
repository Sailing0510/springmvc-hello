package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	// RequestMapping表示用哪个url来访问，最终解析指向对应的hello.jsp
	@RequestMapping({"/hello","/"})
	public String hello(String username, Map<String, Object> context){
		System.out.println("hello: "+ username);
		context.put("username", username);
		return "hello";
	}
	
	@RequestMapping({"welcome", "/"})
	public String welcome(String username, Model model){
		model.addAttribute("username", username);
		return "welcome";
	}
	
}
