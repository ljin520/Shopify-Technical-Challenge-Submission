package com.mvc.mapper;

import com.mvc.javabean.Goods;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class GoodsMapperTest {


    static ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    public static GoodsMapper goodsMapper(){

        GoodsMapper mapper = context.getBean(GoodsMapper.class);
        return mapper;
    }

    public static void main(String[] args) {

        System.out.println(context);
        GoodsMapper bean = context.getBean(GoodsMapper.class);
        System.out.println(bean);
        List<Goods> goods = bean.queryGoods();
        System.out.println(goods);



    }


    @Test
    public void test(){
        System.out.println(context);
        GoodsMapper bean = context.getBean(GoodsMapper.class);
        Goods goods = new Goods();
        goods.setName("辣条");
        goods.setPrice(5);
        goods.setNum(50);
        int i = bean.addGoods(goods);
        System.out.println(i);
    }


}
