package com.control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Dao;
import com.lowagie.text.Document;
import com.model.SuperAdmin;
@org.springframework.stereotype.Controller


public class Controller {
	
	@Autowired Dao dao;
	@Autowired ModelAndView mav;
	@Autowired HttpSession sess;
	
	@RequestMapping("/")
	public ModelAndView indn() {
		return new ModelAndView("redirect:/index");
	}
	@RequestMapping("loginpage")
	public ModelAndView loginpage() {
		return new ModelAndView("loginpage");
	}
	//Write Home page code here...............................
	@RequestMapping("/index")
	public ModelAndView ind() {
		ModelAndView mav=new ModelAndView("index");
			return mav;
	}

	
//--------------------------------------------------------------------------------
	//Write Home page code here...............................
			
	
	@RequestMapping("/sadm")
	public ModelAndView sadms()
	{
		mav.addObject("sadms", "y");
		mav.addObject("adms", "n");
		mav.addObject("logsts", "");
		mav.setViewName("loginpage");
		return mav;
	}
	
	@RequestMapping(value="/regsadm")
	public ModelAndView sadm(@ModelAttribute ("sa") SuperAdmin sa) {
		dao.savesa(sa);
		mav.setViewName("loginpage");
		mav.addObject("logsts", "registered successfully");
		return mav;
	}
	
	@RequestMapping(value="/lgsadm")
	public ModelAndView lgsadm(@ModelAttribute ("sa") SuperAdmin sa) {
		sa=dao.getSAlog(sa);
		if(sa.getSadmid()!=-1){
			sess.setAttribute("isLogged", "y");
			sess.setAttribute("lgusr", sa);
			sess.setAttribute("lgusrtyp", "sadm");
			mav.setViewName("sadmnhmpg");
			mav.addObject("logsts", "registered successfully");
			return mav;
		}else{
			mav.setViewName("loginpage");
			mav.addObject("errmsg", "login Failed");
			return mav;
		}
	}
	
	
	
	
	@RequestMapping("/sadmnhmpg")
	public ModelAndView sadmnhmpg()
	{
		mav.setViewName("sadmnhmpg");
		return mav;
	}
	
	@RequestMapping("/sadmlogout")
	public ModelAndView sadmlogout()
	{
		sess.setAttribute("isLogged", "n");
		sess.setAttribute("lgusrtyp", "n");
		sess.setAttribute("lgusr", "");
		sess.invalidate();
		mav.setViewName("redirect:/sadm");
		return mav;
	}
	
	@RequestMapping(value="addnbb")
	public ModelAndView addnbb()
	{
		mav.setViewName("nbb_rfrm");
		return mav;
	}
	
//------------------------------------------------------------------
	@RequestMapping("/adm")
	public ModelAndView adms()
	{
		mav.addObject("sadms", "n");
		mav.addObject("adms", "y");
		mav.setViewName("loginpage");
		return mav;
	}
	
	
	//Write Home page code here...............................
		@RequestMapping("/about")
		public ModelAndView inds() {
			ModelAndView mav=new ModelAndView("about");
				return mav;
		}

		@RequestMapping("/blog")
		public ModelAndView indsws() {
			ModelAndView mav=new ModelAndView("blog");
				return mav;
		}
		@RequestMapping("/contact")
		public ModelAndView indss() {
			ModelAndView mav=new ModelAndView("contact");
				return mav;
		}

			
		@RequestMapping("/payment")
		public ModelAndView insds() {
			ModelAndView mav=new ModelAndView("payment");
				return mav;
		}
		
		@RequestMapping("/services")
		public ModelAndView sdinds() {
			ModelAndView mav=new ModelAndView("services");
				return mav;
		}
		
		@RequestMapping("/team")
		public ModelAndView inxds() {
			ModelAndView mav=new ModelAndView("team");
				return mav;
		}



}
