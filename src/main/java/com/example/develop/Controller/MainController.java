package com.example.develop.Controller;

import com.example.develop.domain.DevelopData;
import com.example.develop.service.DevelopDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController("/dev")
public class MainController {

    @Autowired
    private DevelopDataService devDataService;
    @GetMapping("/check")
    @ResponseBody
    public String check(){
        return "success";
    }

    @GetMapping("/dbData")
    @ResponseBody
    public List<DevelopData> getDBData(){
        return devDataService.getAllDevelopData();
    }
}
