package ashwin.hellocontroller;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
	
	@RequestMapping("/welcome/{Country}/{UserName}")
	protected ModelAndView helloWorld(@PathVariable Map<String,String> pathVar){
		
		String name = pathVar.get("UserName");
		String country = pathVar.get("Country");
		ModelAndView mnv = new ModelAndView("HelloPage");
		mnv.addObject("welcomeMsg", "Welcome "+name+" You are from "+country);
		return mnv;
	}
		
}
