package com.xerago.cvm.etl.domain.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xerago.cvm.etl.domain.Database;

@Repository
@Transactional
public interface DatabaseRepository extends JpaRepository<Database, Integer>{

}
