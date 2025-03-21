package com.Liveasy.internship.repositories;


import com.Liveasy.internship.entities.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepo extends JpaRepository<Load,Long> {

}
