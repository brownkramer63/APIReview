package com.cydeo.repository;

import com.cydeo.Entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Jobs,Long> {


}
