package com.atguigu.aaa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class E {
    @RequestMapping("e")
    @ResponseBody
    public  String  e(){
        System.out.println("e = ");
        System.out.println("eeeeeee" );
        return "eee";
    }
}
