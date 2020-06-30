package com.example.demo.repo;

import com.example.demo.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestSpecRepository extends JpaRepository<People, Integer>, JpaSpecificationExecutor<People> {
    @Query(value = "SELECT * " +
            "FROM Linh_test_people a " +
            "INNER JOIN Linh_test_computer b " +
            "ON a.computer_id = b.id", nativeQuery = true)
    List<People> testJoin();
}
