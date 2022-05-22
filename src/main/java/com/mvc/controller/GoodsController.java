package com.mvc.controller;

import com.mvc.javabean.Goods;
import com.mvc.javabean.Info;
import com.mvc.service.GoodsService;
import com.mvc.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @Autowired
    private InfoService infoService;


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){

        return "redirect:/goods";

    }


    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    public String selectAll(Model model){

        List<Goods> goods = goodsService.queryGoods();

        System.out.println(goods);
        model.addAttribute("data",goods);
        return "goods";

    }

    @RequestMapping(value = "/goods/{id}",method = RequestMethod.GET)
    public String deleteGoods(@PathVariable String id){

        goodsService.deleteGoods(id);
        return "redirect:/goods";

    }


    @RequestMapping(value = "/addGoods",method = RequestMethod.POST)
    public String addGoods(String name,double price,int num){

        Goods goods = new Goods(null, name, price, num);
        System.out.println(goods);
        goodsService.addGoods(goods);
        return "redirect:/goods";

    }

    @RequestMapping(value = "/query/{id}",method = RequestMethod.GET)
    public String getGoods(@PathVariable String id,Model model){

        Goods goods = goodsService.queryGoodsById(id);
        System.out.println(goods);
        model.addAttribute("goods",goods);

        return "update";

    }

    @RequestMapping(value = "/comment/{id}",method = RequestMethod.GET)
    public String commentGoods(@PathVariable String id,Model model){

        Goods goods = goodsService.queryGoodsById(id);
        System.out.println(goods);
        model.addAttribute("goods",goods);

        return "comment";

    }

    @RequestMapping(value = "/updateGoods",method = RequestMethod.POST)
    public String updateGoods(String id,String name,double price,int num){

        Goods goods = new Goods(id, name, price, num);
        System.out.println(goods);
        goodsService.updateGoods(goods);
        return "redirect:/goods";

    }

    // Each shipment ,only shipping one item
    public int shipping(Info item){
        String ID = item.getId();
        Goods goods = goodsService.queryGoodsById(ID);
        return goods.getNum() - 1;
    }



    @RequestMapping(value = "/commentGoods",method = RequestMethod.POST)
    public String commentGoods(Info info){


        System.out.println(info);
        int i = infoService.delivery(info);
        return updateGoods(info.getId(),info.getName(),info.getPrice(),shipping(info));
        //return "redirect:/goods";

    }


}
