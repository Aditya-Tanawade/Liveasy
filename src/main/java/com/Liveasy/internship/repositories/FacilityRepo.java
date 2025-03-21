package com.Liveasy.internship.repositories;

import com.Liveasy.internship.entities.Facility;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepo extends JpaRepository<Facility,Long> {
}
