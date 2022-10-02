package com.codekul.javafullstack.javaaprilmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SampleRepository extends MongoRepository<Sample,String> {

}


/*
> use javaaprilmongo;
switched to db javaaprilmongo
> show collections;
sample
>  db.sample.find();
{ "_id" : ObjectId("6315ace4841f6c2bd3d3ee90"), "name" : "Akash", "address" : "Banglore", "_class" : "com.codekul.javafullstack.javaaprilmongo.Sample" }
> db.sample.find().pretty();
{
        "_id" : ObjectId("6315ace4841f6c2bd3d3ee90"),
        "name" : "Akash",
        "address" : "Banglore",
        "_class" : "com.codekul.javafullstack.javaaprilmongo.Sample"
}
> db.sample.insert({'name':"Akash",'address':"Pune"});
WriteResult({ "nInserted" : 1 })
> db.sample.insertOne({'name':"Suhas",'address':"Pune"});
{
        "acknowledged" : true,
        "insertedId" : ObjectId("63175419a979eb06886fb63a")
}
>  db.sample.find().pretty();
{
        "_id" : ObjectId("6315ace4841f6c2bd3d3ee90"),
        "name" : "Akash",
        "address" : "Banglore",
        "_class" : "com.codekul.javafullstack.javaaprilmongo.Sample"
}
{
        "_id" : ObjectId("631753f5a979eb06886fb639"),
        "name" : "Akash",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175419a979eb06886fb63a"),
        "name" : "Suhas",
        "address" : "Pune"
}
>  db.sample.insertMany([{'name':"Ravi",'address':"Pune"},{'name':"Giri",'address':"Pune"}]);
{
        "acknowledged" : true,
        "insertedIds" : [
                ObjectId("63175471a979eb06886fb63b"),
                ObjectId("63175471a979eb06886fb63c")
        ]
}
> {
...
... db.sample.remove({"_id" : ObjectId("63159ff9debb8d45fc359ae9")});
...
...
>
>
>
>
> db.sample.remove({"_id" : ObjectId("63159ff9debb8d45fc359ae9")});
WriteResult({ "nRemoved" : 0 })
> db.sample.find().pretty();
{
        "_id" : ObjectId("6315ace4841f6c2bd3d3ee90"),
        "name" : "Akash",
        "address" : "Banglore",
        "_class" : "com.codekul.javafullstack.javaaprilmongo.Sample"
}
{
        "_id" : ObjectId("631753f5a979eb06886fb639"),
        "name" : "Akash",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175419a979eb06886fb63a"),
        "name" : "Suhas",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175471a979eb06886fb63b"),
        "name" : "Ravi",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175471a979eb06886fb63c"),
        "name" : "Giri",
        "address" : "Pune"
}
> db.sample.update({"_id" : ObjectId("6315a03bdebb8d45fc359aeb")},{$set:{"name" : "Giridhar"}});
WriteResult({ "nMatched" : 0, "nUpserted" : 0, "nModified" : 0 })
> db.sample.find().pretty();
{
        "_id" : ObjectId("6315ace4841f6c2bd3d3ee90"),
        "name" : "Akash",
        "address" : "Banglore",
        "_class" : "com.codekul.javafullstack.javaaprilmongo.Sample"
}
{
        "_id" : ObjectId("631753f5a979eb06886fb639"),
        "name" : "Akash",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175419a979eb06886fb63a"),
        "name" : "Suhas",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175471a979eb06886fb63b"),
        "name" : "Ravi",
        "address" : "Pune"
}
{
        "_id" : ObjectId("63175471a979eb06886fb63c"),
        "name" : "Giri",
        "address" : "Pune"
}
>
 */