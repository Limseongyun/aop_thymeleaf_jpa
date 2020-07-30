package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping(value = "/thindex")
	public String index() {
		return "thymeleaf/welcome";
	}
}
