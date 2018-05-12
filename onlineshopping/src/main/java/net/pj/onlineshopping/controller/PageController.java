package net.pj.onlineshopping.controller;

import net.pj.shoppingbackend.dao.CategoryDAO;
import net.pj.shoppingbackend.dto.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting","Welcome to spring WEB MVC");
		mv.addObject("title", "Home");
//		passing list of objects
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting","Welcome to spring WEB MVC");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact(){
		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting","Welcome to spring WEB MVC");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	
	
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting){
//		if(greeting==null){
//			greeting="Hello there";
//		}
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting")String greeting){
//		if(greeting==null){
//			greeting="Hello there";
//		}
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//	}
	
	
//	show all products
	@RequestMapping("show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping("show/category/{id}/products")
	public ModelAndView showCategory(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("page");
		
//		CategoryDAO to fetch single data
		Category category=null;
		category=categoryDAO.get(id);
		mv.addObject("title",category.getName());
		mv.addObject("categories", categoryDAO.list());
		
//		passing a single cztegory object
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
	
}
