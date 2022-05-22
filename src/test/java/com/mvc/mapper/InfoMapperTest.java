package com.mvc.mapper;

import com.mvc.javabean.Info;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InfoMapperTest {

    static ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    public static InfoMapper goodsMapper(){

        InfoMapper mapper = context.getBean(InfoMapper.class);
        return mapper;
    }

    @Test
    public void test(){

        InfoMapper mapper = goodsMapper();

        Info info = new Info("1", "矿泉水", "北京", "123", "123@qq.com", "1",1);


        int i = mapper.delivery(info);
        System.out.println(i);
    }

}
