package com.wf.json.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class NumberList {

    @RequestMapping("/test")
    public String numberList(Model model){
        List<Integer>numList=new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            numList.add(i);
        }
        model.addAttribute("numList",numList);
        System.out.println(numList);
       return "test";
    }
}
