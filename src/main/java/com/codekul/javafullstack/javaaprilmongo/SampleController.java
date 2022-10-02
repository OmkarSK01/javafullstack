package com.codekul.javafullstack.javaaprilmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample")
public class SampleController {
    @Autowired
    private SampleRepository sampleRepository;

    @PostMapping
    public String saveSample(@RequestBody Sample sample){
        sampleRepository.save(sample);
        return "sample saved";
    }
}




/*
> use javaaprilmongo;
switched to db javaaprilmongo
> show collections;
> show collections;
> show collections;
> show collections;
sample
> db.sample.find();
{ "_id" : ObjectId("6315ace4841f6c2bd3d3ee90"), "name" : "Akash", "address" : "Banglore", "_class" : "com.codekul.javafullstack.javaaprilmongo.Sample" }
>



 */