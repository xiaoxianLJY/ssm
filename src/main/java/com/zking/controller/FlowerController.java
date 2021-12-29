package com.zking.controller;

import com.zking.model.Flower;
import com.zking.service.IFlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FlowerController {

    @Autowired
    private IFlowerService flowerService;

    /**
     * http://localhost:8080/ssm/list
     * 查询所以
     * @param session
     * @param flower
     * @return
     */
    @RequestMapping("list")
    public String list(HttpSession session,Flower flower){
        List<Flower> flowers = flowerService.list(flower);
        session.setAttribute("flowers",flowers);
        System.out.println(flowers);
        return "flowerMain";
    }
    @RequestMapping("/AddFlower")
    public String AddFlower(Flower flower){
        Flower f = flowerService.selectByPrimaryKey(flower.getFid());
        if(null==f){
            flowerService.insert(flower);
            return "redirect:list";
        }else{

            return "addFlower";
        }

    }

    @RequestMapping("/EditFlower")
    public String EditFlower(Flower flower){
        Flower f = flowerService.selectByPrimaryKey(flower.getFid());
        System.out.println("对象"+f);
        if(null!=f){
            flowerService.updateByPrimaryKey(flower);
            return "redirect:list";
        }else{

            return "editFlower";
        }
    }

    @RequestMapping("/DelFlower")
    public String DelFlower(Flower flower){
        int i = flowerService.deleteByPrimaryKey(flower.getFid());
        return "redirect:list";
    }



}
