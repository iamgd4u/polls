package springmvc.controller;

import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.service.UserService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		//sending data from controller
		String name = "gourav";
		List<String> friends = new ArrayList<String>(List.of("akshat", "vinay"));
		LocalDateTime time = LocalDateTime.now();
		model.addAttribute("name",name);
		model.addAttribute("friends",friends);
		model.addAttribute("time",time);
		return "index.jsp";
	}

	@RequestMapping("/jstl")
	public String jstl(Model model){
		String name = "gourav";
		List<String> friends = new ArrayList<String>(List.of("akshat", "vinay"));
		LocalDateTime time = LocalDateTime.now();
		model.addAttribute("name",name);
		model.addAttribute("friends",friends);
		model.addAttribute("time",time);

		return "jstl.jsp";
	}

	@RequestMapping("/show")
	public String show(){
		return "contact.jsp";
	}

//	@RequestMapping(path = "/processform",method = RequestMethod.POST)
//	public String process( @RequestParam("email") String email, @RequestParam("password") String password, Model model ){
//
//		model.addAttribute("email",email);
//		model.addAttribute("password", password);
//		return "success.jsp";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String process(@ModelAttribute User user){
		//bind incoming data + send binded data w/o Model class
		userService.createUser(user);
		return "success.jsp";
	}


}
