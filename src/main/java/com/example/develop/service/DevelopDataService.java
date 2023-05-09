package com.example.develop.service;

import com.example.develop.domain.DevelopData;
import com.example.develop.repo.DevelopDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevelopDataService {

    @Autowired
    private DevelopDataRepo devDataRepo;

    public List<DevelopData> getAllDevelopData(){
        return devDataRepo.findAll();
    }
}
