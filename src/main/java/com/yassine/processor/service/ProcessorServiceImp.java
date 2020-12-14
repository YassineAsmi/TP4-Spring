package com.yassine.processor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.processor.entities.Processor;
import com.yassine.processor.repository.ProcessorRepos;

@Service
public class ProcessorServiceImp implements ProcessorService {

	
	
	
	
	
	
	
	@Autowired ProcessorRepos processorRepository;
	@Override
	public Processor saveProcessor(Processor p) { return processorRepository.save(p);
}
	@Override
	public Processor updateProcessor(Processor p) {
		return processorRepository.save(p);
	}
	@Override
	public void deleteProcessor(Processor p) {
		processorRepository.delete(p);		
	}
	@Override
	public void deleteProcessorById(Long id) {
		processorRepository.deleteById(id);		
	}
	@Override
	public Processor getProcessor(Long id) {
		return processorRepository.findById(id).get();
	}
	@Override
	public List<Processor> getAllProcessor() {
		return processorRepository.findAll();
	}
}