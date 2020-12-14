package com.yassine.processor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.processor.entities.Processor;

public interface ProcessorRepos extends JpaRepository<Processor, Long> {

}
