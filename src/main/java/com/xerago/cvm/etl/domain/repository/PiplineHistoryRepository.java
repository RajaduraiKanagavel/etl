package com.xerago.cvm.etl.domain.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xerago.cvm.etl.domain.PiplineHistory;

@Repository
@Transactional
public interface PiplineHistoryRepository extends JpaRepository<PiplineHistory, Integer>{

}
