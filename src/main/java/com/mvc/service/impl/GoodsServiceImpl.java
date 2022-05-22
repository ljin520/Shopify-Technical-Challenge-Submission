package com.mvc.service.impl;


import com.mvc.javabean.Goods;
import com.mvc.mapper.GoodsMapper;
import com.mvc.service.GoodsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    static ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    public static GoodsMapper getMapper(){

        GoodsMapper mapper = context.getBean(GoodsMapper.class);
        return mapper;
    }

    @Override
    public void addGoods(Goods goods) {
        GoodsMapper mapper = getMapper();
        mapper.addGoods(goods);
    }

    @Override
    public void deleteGoods(String id) {
        GoodsMapper mapper = getMapper();
        mapper.deleteGoods(id);
    }

    @Override
    public void updateGoods(Goods goods) {
        GoodsMapper mapper = getMapper();
        mapper.updateGoods(goods);
    }

    @Override
    public Goods queryGoodsById(String id) {
        GoodsMapper mapper = getMapper();
        return mapper.queryGoodsById(id);
    }

    @Override
    public List<Goods> queryGoods() {
        GoodsMapper mapper = getMapper();
        return mapper.queryGoods();
    }

}
