package com.xiaohuan.dataanalysis.controller;

import com.xiaohuan.dataanalysis.vo.Student;
import org.springframework.web.bind.annotation.*;

@RequestMapping("nameController")
@RestController
public class NameController {

    @PostMapping("getName")
    public String getName(@RequestBody Student student){
//        String id = map.getString("id");
//
//        System.out.println(map);
        String id = student.getId();
        if ("jwx813858".equals(id)){
            return "贾琼";
        }
        return "";
    }

    @GetMapping("/getAge/{id}")
    public String getAge(@PathVariable("id") String id){
        System.out.println(id);
        if ("jwx813858".equals(id)){
            return "贾琼";
        }
        return "";
    }
}
