package com.control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.dao.Dao;

import com.lowagie.text.Document;
import com.model.BBranch;

import com.model.AdminLogin;

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
		
		System.out.println("Session null= ");
		try{
			String s1=sess.getAttribute("isLogged").toString();
			System.out.println(s1);
		}catch(NullPointerException npe)
		{
			sess.setAttribute("isLogged", "n");
		}
		try{
			String s1=sess.getAttribute("lgusrtyp").toString();
			System.out.println(s1);
		}catch(NullPointerException npe)
		{
			sess.setAttribute("lgusrtyp", "n");
		}
		sess.setAttribute("sadms","y");
		sess.setAttribute("adms","n");
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
	
	
	
	
	
	//admin login code here..........................
	@RequestMapping(value="/loginadmin")
	public ModelAndView lgsadm(@ModelAttribute ("al") AdminLogin al) {
		ModelAndView mav=new ModelAndView();
		System.out.println("Id....."+al.getAdminid());
		System.out.println("Id....."+al.getUsername());
		System.out.println("Id....."+al.getPassword());
		al=dao.adlogin(al);
		if(al.getAdminid()!=-1){
			sess.setAttribute("isLogged", "y");
			sess.setAttribute("lgusr", al);
			sess.setAttribute("lgusrtyp", "sadm");
			mav.setViewName("admin");
			System.out.println("Login Success");
			mav.addObject("logsts", "registered successfully");
			return mav;
		}else{
			mav.setViewName("adminlogin");
			System.out.println("Login Failed");
			mav.addObject("errmsg", "login Failed");
			return mav;
		}
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
	
	@RequestMapping(value="/rnbb")
	public ModelAndView rnbb(@ModelAttribute ("nb") BBranch nb)
	{
		dao.savenb(nb);
		mav.setViewName("nbb_rfrm");
		mav.addObject("rsts", "registered successfully");
		return mav;
	}
	@RequestMapping(value="addnbb")
	public ModelAndView addnbb()
	{
		/*mav=new ModelAndView();*/
		mav.setViewName("nbb_rfrm");
		return mav;
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
			/*-------------------------------------------*/
	@RequestMapping("/setup_country")
	public ModelAndView setc()
	{
		mav.setViewName("setcountry");
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
