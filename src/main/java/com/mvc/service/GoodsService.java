package com.mvc.service;




import com.mvc.javabean.Goods;

import java.util.List;

public interface GoodsService {


    public void addGoods(Goods goods);


    public void deleteGoods(String id);


    public void updateGoods(Goods goods);


    public Goods queryGoodsById(String id);


    public List<Goods> queryGoods();



}
