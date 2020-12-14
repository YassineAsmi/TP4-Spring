package com.yassine.processor;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yassine.processor.entities.Processor;
import com.yassine.processor.repository.ProcessorRepos;

@SpringBootTest
class TpSpringApplicationTests {

	@Autowired
	private ProcessorRepos processorRepository;
	@Test
	public void testCreateProcessor() {
	Processor pros = new Processor("intel core i7","7700HQ",1500.0,new Date());
	processorRepository.save(pros);
	}
	@Test
	public void testDeleteProcessor() {
		{
			processorRepository.deleteById(1L);; }
		}
	
	@Test
	public void testListerTousProcessor()
		{
		List<Processor> prods = processorRepository.findAll();
		for (Processor p : prods)
		{
		System.out.println(p);
		}
		
	}
}
