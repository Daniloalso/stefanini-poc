package com.stefanini.poc.repositories;

import com.stefanini.poc.models.LogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LogRepository extends JpaRepository<LogModel,Long>, JpaSpecificationExecutor<LogModel> {
}
