package com.rayyu.ssm4t.controller;

import com.rayyu.ssm4t.domain.Product;
import com.rayyu.ssm4t.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class productController {

    @Autowired
    private productService service;

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Date.class, new MyDateEdit("yyyy-MM-dd HH:mm"));    }

    /**
     * 查询全部商品
     *
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView();

        List<Product> all = service.findAll();

        //存入 前端获取
        mav.addObject("productList", all);

        mav.setViewName("view-productlist");
//        System.out.println(all);

        return mav;
    }







    /**
     * 根据id 查询
     * 修改适用
     *
     * @param id
     * @return
     */
//    @RequestMapping("/findProductByid")
//    public ModelAndView findProductByCityname(String id) {
//
//        ModelAndView mav = new ModelAndView();
//        Product productBycityName = service.findProductBycityName(id);
//
//        mav.addObject("productByCityname", productBycityName);
//
//        mav.setViewName("view-productlist1");
//
//        return mav;
//    }

    /**
     * 新增商品
     *
     * @param product
     * @return
     */
    @RequestMapping("/saveProduct")
    public String saveProduct(Product product) {
        service.saveProduct(product);
        return "redirect:findAll";
    }



}
