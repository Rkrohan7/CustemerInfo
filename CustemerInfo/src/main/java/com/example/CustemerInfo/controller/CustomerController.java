package com.example.CustemerInfo.controller;

import com.example.CustemerInfo.dao.CustomerDao;
import com.example.CustemerInfo.entity.Custmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
   private CustomerDao customerDao;

    @PostMapping("/addCustomer")
    public  String addCustomer(@RequestBody Custmer custmer){
return  customerDao.addCustomer(custmer);
    }

    @GetMapping("/get")
    public  String getMsg(){
        return "hello";
    }
}
