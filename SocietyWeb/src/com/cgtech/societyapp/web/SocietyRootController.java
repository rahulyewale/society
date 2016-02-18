package com.cgtech.societyapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cgtech.societyapp.dto.Member;
import com.cgtech.societyapp.mongodb.repository.MemberRepository;

@Controller
public class SocietyRootController {

	@Autowired
	MemberRepository memberRepository;
	
	/*@RequestMapping("/")
	public ModelAndView loadFirstPage(){
		Member ram = new Member(1,"Ram",20);
		   Member shyam = new Member(2,"Shyam",19);
		   Member mohan = new Member(3,"Mohan",20);
		   Member krishn = new Member(4,"Krishn",20);
		memberRepository.save(ram);
		memberRepository.save(shyam);
		memberRepository.save(mohan);
		memberRepository.save(krishn);
		
		Member mem = memberRepository.getMemberByName(shyam.name);
		System.out.println(mem.name);
		
		List<Member> members = memberRepository.getMemberByAge(20);
	   System.out.println("----employee for the age 20----");
	   for (Member member : members) {
		System.out.println("Id:"+member.id+",Name:"+member.name);
	   }
		return new ModelAndView("index");
	}
	@RequestMapping("/home")
	public ModelAndView loadHomePage(){
		
		return new ModelAndView("home");
	}
*/	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Admin Page!");
		model.setViewName("admin");

		return model;

	}

	@RequestMapping(value = "/dba**", method = RequestMethod.GET)
	public ModelAndView dbaPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Database Page!");
		model.setViewName("admin");

		return model;

	}
	
	
	
}
