package com.rayyu.ssm4t.service;

import com.rayyu.ssm4t.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface productService  {
    /**
     * 查找全部商品
     * @return
     */
    public List<Product> findAll() throws Exception;

    /**
     * 根据出发地查找商品
     * @return
     */
//    public Product findProductBycityName(String cityName);

    void saveProduct(Product product);

    /**
     * 根据id查找商品
     * @param id
     * @return
     */
//    Product findById(String id) throws Exception;
}
