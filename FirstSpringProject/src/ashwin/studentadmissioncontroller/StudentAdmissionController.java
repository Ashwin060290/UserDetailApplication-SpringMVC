package ashwin.studentadmissioncontroller;



//import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class StudentAdmissionController {
	
	
	@RequestMapping(value = "/admissionform", method=RequestMethod.GET)
	protected ModelAndView getAdmissionForm(){
		
		
		ModelAndView mnv = new ModelAndView("AdmissionForm");
		return mnv;
	}
	
	@RequestMapping(value = "/submitadmission", method=RequestMethod.POST)
	protected ModelAndView submitAdmissionForm(@Valid @ModelAttribute("stud") Student stud, BindingResult result){
		
		if(result.hasErrors()){
			
			ModelAndView mnv = new ModelAndView("AdmissionForm");
			return mnv;
		}
		ModelAndView mnv = new ModelAndView("AdmissionSuccess");
		mnv.addObject("msg","Success");
		
		return mnv;
	}
		
}
