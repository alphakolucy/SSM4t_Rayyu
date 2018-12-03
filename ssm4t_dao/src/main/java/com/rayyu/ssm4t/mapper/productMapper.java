package com.rayyu.ssm4t.mapper;

import com.rayyu.ssm4t.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface productMapper {

    /**
     * 查询所有商品
     * @return
     */
    @Select("select * from product")
    List<Product> findAll() throws Exception;

//    /**
//     * 根据商品cityName查询商品
//     * @param cityName
//     * @return
//     */
//    @Select("select * from product where cityName = id=#{id}")
//    Product findBycityName( String  cityName);


    /**
     * 保存（新增商品）
     * @param product
     */
    @Select( "insert into PRODUCT (productnum, productname, cityname, departuretime, productprice, productdesc, productstatus) values (#{productnum},#{productname},#{cityname},#{departuretime},#{productprice},#{productdesc},#{productstatus}")
    void saveProduct(Product product);


    /**
     *根据id 查询商品
     * @param id
     * @return
     * @throws Exception
     */
    @Select("select * from product where id=#{id}")
    Product findById(String id) throws Exception;
}
