package com.example.demo1;


import com.zjrcu.stspringbootstarter.MyJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJsonController {

    @Autowired
    private MyJsonService myJsonService;

    @RequestMapping("tojson")
    public String getStr() {
        User user = new User();
        user.setName("Savitar");
        user.setAge(28);
        return myJsonService.objToJson(user);
    }
}
