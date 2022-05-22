package com.mvc.mapper;

import com.mvc.javabean.Goods;
import com.mvc.javabean.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface InfoMapper {


    public int delivery(@Param("info") Info info);

}
