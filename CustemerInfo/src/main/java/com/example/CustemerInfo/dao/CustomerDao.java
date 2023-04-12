package com.example.CustemerInfo.dao;

import com.example.CustemerInfo.entity.Custmer;
import com.example.CustemerInfo.repository.CustmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {

    @Autowired
    private CustmerRepository custmerRepository;

    public String addCustomer(Custmer custmer){
        custmerRepository.save(custmer);
        return "Customer is saved!!!!!!!!!!";
    }
}
