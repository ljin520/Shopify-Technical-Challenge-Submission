package com.mvc.service.impl;

import com.mvc.javabean.Info;
import com.mvc.mapper.GoodsMapper;
import com.mvc.mapper.InfoMapper;
import com.mvc.service.InfoService;
import org.omg.CORBA.MARSHAL;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    static ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    public static InfoMapper getMapper(){

        InfoMapper mapper = context.getBean(InfoMapper.class);
        return mapper;
    }

    @Override
    public int delivery(Info info) {
        InfoMapper mapper = getMapper();
        int i = mapper.delivery(info);
        return i;
    }
}
