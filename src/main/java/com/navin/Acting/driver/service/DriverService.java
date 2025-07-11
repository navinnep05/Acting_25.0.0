package com.navin.Acting.driver.service;



import com.navin.Acting.driver.Repo.DriverDetailRepository;
import com.navin.Acting.driver.entity.DriverDetailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverDetailRepository driverDetailRepository;


    public List<DriverDetailEntity> allUserList() {
        List<DriverDetailEntity> driverList = driverDetailRepository.findAll();
        return driverList;
    }
}
