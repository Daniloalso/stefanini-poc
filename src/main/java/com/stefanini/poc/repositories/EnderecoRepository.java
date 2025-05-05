package com.stefanini.poc.repositories;


import com.stefanini.poc.models.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnderecoRepository extends JpaRepository<EnderecoModel,Long>, JpaSpecificationExecutor<EnderecoModel>{
}
