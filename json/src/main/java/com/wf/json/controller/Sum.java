package com.wf.json.controller;

import com.wf.json.pojo.Add;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Validated
@Controller
public class Sum {
    @RequestMapping("/sum")
    public  String sum(Model model){
        Add add=new Add();
        model.addAttribute("add",add);
        return "sum";
    }
    @RequestMapping(value = "/sumpost" )

    public String testDemo(
             @RequestParam(value="first") String first
            , @RequestParam(value="second") String second, Model model){

        double sum=Double.parseDouble(first)+Double.parseDouble(second);
        model.addAttribute("sum",sum);
        model.addAttribute("first",first);
        model.addAttribute("second",second);
        System.out.println(sum);
        return "sum";
    }


}
