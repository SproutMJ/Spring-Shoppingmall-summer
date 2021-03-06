package com.newlecture.web.controller.admin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.extra.spath.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.newlecture.web.entity.Category;
import com.newlecture.web.entity.Product;
import com.newlecture.web.entity.ProductImageFile;
import com.newlecture.web.service.CategoryService;
import com.newlecture.web.service.ProductImageFileService;
import com.newlecture.web.service.ProductService;

@Controller("adminHomeController")
@RequestMapping("/admin")
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productServiece;
	
	@Autowired
	private ProductImageFileService productImageFileService;
	
	@RequestMapping("")
	public String index(HttpServletRequest request) {
		request.setAttribute("categoryList", categoryService.getCategoryList());
		return "admin/index";
	}
	
	@RequestMapping("/registerCategory")
	public String registerCategory(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String realPath = new File("src/main/resources/static/img/products").getAbsolutePath();
		realPath += File.separator + name;
		
		categoryService.registerCategory(new Category(0, name), realPath);
		
		return "redirect:/admin";
	}
	
	@RequestMapping("/registerProduct")
	public String registerProduct(MultipartHttpServletRequest request) throws IllegalStateException, IOException {
		productServiece.registerProduct(new Product(0, categoryService.retrieveIdByName(request.getParameter("category")), 
				request.getParameter("name"), Integer.parseInt(request.getParameter("price")), Integer.parseInt(request.getParameter("stock"))
				, request.getParameter("desc"), Date.from(Instant.now())));
		
		MultipartFile imgFile = request.getFile("image");
		String path = "src/main/resources/static/img/products/" + request.getParameter("category") + "/";
		String remoteName = System.currentTimeMillis() + imgFile.getOriginalFilename();
		imgFile.transferTo(Paths.get(path + remoteName));
		productImageFileService.registerProductImageFile(new ProductImageFile(0, productServiece.retrieveCurId(), imgFile.getOriginalFilename(), remoteName, imgFile.getSize(), Date.from(Instant.now())));
		
		return "redirect:/admin";
	}
	
}
