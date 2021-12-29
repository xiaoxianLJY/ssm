package com.zking.controller;

import com.zking.model.Flower;
import com.zking.service.IFlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class RequesstController {
    @Autowired
    private IFlowerService flowerService;

    @RequestMapping("/goAddFlowewr")
    public String goSave(){


        return "addFlower";
    }

    @RequestMapping("/goEditFlowewr")
    public String goEditFlowewr(HttpSession session,@RequestParam("fid") Integer fid){
        Flower flower = flowerService.selectByPrimaryKey(fid);
        System.out.println(flower);
        session.setAttribute("f",flower);
        return "editFlower";
    }

}
