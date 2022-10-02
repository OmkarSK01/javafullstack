package com.codekul.javafullstack.manytomany.repository;

import com.codekul.javafullstack.manytomany.domain.Teacher;
import com.codekul.javafullstack.manytomany.dto.TeacherResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
//1 june
//public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
//}



//6june-store procedure call in sprinboot
//public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
//    @Query(value = "call getTeacherData()",nativeQuery = true)
//    List<Map<String,String >> getTeacherData();
//}   //he pn chlel kiva khalch pn chalel

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

    @Query(value = "call getTeacherData()",nativeQuery = true)
    List<TeacherResponse> getTeacherData();

}