package com.rayyu.ssm4t.service.impl;

import com.rayyu.ssm4t.domain.Product;
import com.rayyu.ssm4t.mapper.productMapper;
import com.rayyu.ssm4t.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class productServiceImpl implements productService {

    @Autowired
    private productMapper mapper ;

    @Override
    public List<Product> findAll() throws Exception {
        System.out.println("service层 findAll 方法");
        List<Product> all = mapper.findAll();
        return all;
    }


//    @Override
//    public Product findProductBycityName(String cityName) {
//        System.out.println("service层 findProductBycityName 方法");
//        Product product = mapper.findBycityName(cityName);
//        return product;
//    }

    /**
     * 新增商品
     * @param product
     */
    @Override
    public void saveProduct(Product product) {
        System.out.println("service层 saveProduct 方法");
        mapper.saveProduct(product);
    }

//    @Override
//    public Product findById(String id) throws Exception {
//        System.out.println("service层 findById 方法");
//        Product pro = mapper.findById(id);
//        return pro;
//    }
}
