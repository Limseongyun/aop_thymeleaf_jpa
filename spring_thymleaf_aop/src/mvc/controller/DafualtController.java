package mvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import mvc.service.DefaultServiceimple;
import mvc.vo.UserCommentVO;

@Controller
public class DafualtController {
	@Autowired
	private DefaultServiceimple defaultservice;
	
	@RequestMapping(value = "/")
	public String index(Model m) {
		List<UserCommentVO> list = defaultservice.getlist();
		m.addAttribute("list", list);
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		System.out.println(format1.format(time.getTime()));
		System.out.println(time);
		return "jsp/index";
	}
	@RequestMapping(value = "/input")
	public ModelAndView input(UserCommentVO vo) {
		ModelAndView mav = new ModelAndView("redirect:/");
		defaultservice.insert(vo);
		return mav;
	}
	@RequestMapping(value = "/output")
	public String output(Model m) {
		
		return "redirect:/";
	}
}
