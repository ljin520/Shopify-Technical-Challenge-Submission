package com.mvc.service;

import com.mvc.javabean.Info;
import org.apache.ibatis.annotations.Param;

public interface InfoService {

    //Save shipment information
    public int delivery(Info info);

}
