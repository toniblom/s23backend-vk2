package s23back.helloThymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	//	Task 1 Hello Thymeleaf
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(@RequestParam(name="name") String name, 
			@RequestParam(name="age") int age, 
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}

}
