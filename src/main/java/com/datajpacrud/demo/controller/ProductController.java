package com.datajpacrud.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datajpacrud.demo.model.Product;
import com.datajpacrud.demo.model.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	ProductRepo repo;
	
	@RequestMapping(value = "/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(Product product) {
		ModelAndView mv = new ModelAndView("success.jsp");
		repo.save(product);
		return mv;
	}
	
	@RequestMapping(value = "/getProduct")
	public ModelAndView getProduct(@RequestParam Integer productId) {
		ModelAndView mv = new ModelAndView("showProduct.jsp");
		Product product = repo.findById(productId).orElse(null);
		mv.addObject(product);
		return mv;
	}
	
	@RequestMapping(value = "/getAllProducts")
	public ModelAndView getAllProducts() {
		ModelAndView mv = new ModelAndView("showAllProducts.jsp");
		 List<Product> listofProducts = repo.findAll();
		 mv.addObject("listOfProducts", listofProducts);
		 return mv;
	}
	
	@RequestMapping(value = "/updateProduct")
	public ModelAndView updateProduct(@RequestParam Integer productId) {
		ModelAndView mv = new ModelAndView("updateProduct.jsp");
		 Product productToBeUpdated =  repo.findById(productId).orElse(null);
		 productToBeUpdated.setProductPrice(52000);
		 repo.save(productToBeUpdated);
		 mv.addObject(productToBeUpdated);
		 return mv;
	}
	
	@RequestMapping(value = "/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam Integer productId) {
		ModelAndView mv = new ModelAndView("deleteProduct.jsp");
		Product productToBeDeleted = repo.findById(productId).orElse(null);
		repo.delete(productToBeDeleted);
		mv.addObject(productToBeDeleted);
		return mv;
	}
	
	

}
