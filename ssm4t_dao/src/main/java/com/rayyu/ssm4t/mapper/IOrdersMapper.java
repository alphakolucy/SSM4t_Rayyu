package com.rayyu.ssm4t.mapper;


import com.rayyu.ssm4t.domain.Member;
import com.rayyu.ssm4t.domain.Orders;
import com.rayyu.ssm4t.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrdersMapper {

    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "com.rayyu.ssm4t.mapper.productMapper.findById")),

    })
    List<Orders> findAll() throws Exception;


    //多表操作 获取orders
    @Select("select * from orders where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "com.rayyu.ssm4t.mapper.ProductMapper.findById")),
            @Result(column = "id", property = "travellers", many = @Many(select = "com.rayyu.ssm4t.mapper.ITravellerMapper.findByOrdersId")),
            @Result(column = "memberId", property = "member", one = @One(select = "com.rayyu.ssm4t.mapper.IMemberMapper.findById")),
    })
    Orders findById(String id) throws Exception;



//    @Result(column = "id", property = "travellers", many = @Many(select = "com.rayyu.ssm4t.mapper.ITravellerMapper.findByOrdersId")),
//    @Result(column = "memberId", property = "member", one = @One(select = "com.rayyu.ssm4t.mapper.IMemberMapper.findById")),
}
