package com.codekul.javafullstack.storeprocedure;

import com.codekul.javafullstack.onetomany.domain.Vehical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SPRepository extends JpaRepository<Vehical,Long> {
    @Query(value = "{call getVehicalData()}",nativeQuery = true)
    List<Map<String,String>>getVehical();
}
