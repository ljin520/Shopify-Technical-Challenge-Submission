package com.mvc.mapper;


import com.mvc.javabean.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsMapper {


    public int addGoods(@Param("goods")Goods goods);


    public int deleteGoods(@Param("id") String id);


    public int updateGoods(@Param("goods") Goods goods);


    public Goods queryGoodsById(@Param("id") String id);


    public List<Goods> queryGoods();

}
