//package com.rayyu.ssm4t.mapper;
//
//import com.rayyu.ssm4t.domain.Product;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.List;
//
//public class productTest {
//
//    @Test
//    public void findAll() throws Exception {
//        //获取spring容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("del/applicationContext.xml");
//
//        //获取mapper
//        productMapper pm = ac.getBean(productMapper.class);
//
//        //查询数据库
//
//        List<Product> all = pm.findAll();
//
//        for (Product product : all) {
//            System.out.println(product);
//        }
////        System.out.println(all);
//    }
//}
