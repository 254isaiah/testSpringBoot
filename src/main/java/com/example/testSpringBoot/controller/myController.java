package com.example.testSpringBoot.controller;

import com.example.testSpringBoot.model.Legislator;
import com.example.testSpringBoot.repository.myRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class myController {
    @Autowired
    private RestTemplate restTemplate;
    myRepository repository;

    @GetMapping(value = "/callApi")
    public List<Object> getApi(){
        String url = "https://www.opensecrets.org/api/?method=getLegislators&id=NJ&apikey=14601a5d2babd3ec6414d5471ba6944e";
        Object[] api = restTemplate.getForObject(url, Object[].class);
        //System.out.println(api.toString());
        return Arrays.asList(api);
    }
    @PostMapping(value = "/callApi")
    public Legislator createLegislator(@RequestBody Legislator legislator){
        return repository.save(legislator);
    }
}
