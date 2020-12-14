package com.yassine.processor.service;

import java.util.List;

import com.yassine.processor.entities.Processor;

public interface ProcessorService {
	Processor saveProcessor(Processor p);
	Processor updateProcessor(Processor p);
	void deleteProcessor(Processor p);
	void deleteProcessorById(Long id);
	Processor getProcessor(Long id);
	List<Processor> getAllProcessor();
}
