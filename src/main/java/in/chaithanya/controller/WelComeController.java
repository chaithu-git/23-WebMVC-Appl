package in.chaithanya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelComeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelComeMsg() {
		
		ModelAndView mav=new ModelAndView();
		 mav.addObject("msg","Well Come to My World.........!!!!");
		 mav.setViewName("index");
		 return mav;
	}
}
