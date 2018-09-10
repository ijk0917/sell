package com.imooc.sell.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.dom4j.rule.Mode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.form.CategoryForm;
import com.imooc.sell.service.CategoryService;

@Controller
@RequestMapping("/seller/category")
public class SellCategoryController {

	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/list")
	public ModelAndView list(Map<String , Object> map)
	{
		List<ProductCategory> categorys = categoryService.findAll();
		map.put("categorys", categorys);
		return new ModelAndView("category/list",map);
	}
	
	@GetMapping("/index")
	public ModelAndView index(@RequestParam(value="categoryId" , required = false)Integer categoryId,
			Map<String, Object>map)
	{
		if(null != categoryId)
		{
			ProductCategory productCategory = categoryService.findOne(categoryId);
			map.put("productCategory", productCategory);
		}
		
		return new ModelAndView("category/index",map);
	}
	@PostMapping("/save")
	public ModelAndView save(@Valid CategoryForm form,
							BindingResult bindingResult,
							Map<String, Object> map)
	{
		if(bindingResult.hasErrors())
		{
			map.put("msg", bindingResult.getFieldError().getDefaultMessage());
			map.put("url", "/sell/seller/category/index");
			return new ModelAndView("common/error",map);
		}
		
		ProductCategory productCategory = new ProductCategory();
		try {
			if(null != form.getCategoryId())
			{
				productCategory = categoryService.findOne(form.getCategoryId());
			}
			BeanUtils.copyProperties(form, productCategory);
			categoryService.save(productCategory);
		}
		catch (SellException e) {
			map.put("msg", e.getMessage());
			map.put("url", "/sell/seller/category/index");
			return new ModelAndView("common/error",map);
		}
		
		map.put("url", "/sell/seller/category/list");
		return new ModelAndView("common/success",map);
		
		
	}
}
