package com.yassine.processor.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yassine.processor.entities.Processor;
import com.yassine.processor.service.ProcessorService;

@Controller
public class ProcessorController {
	@Autowired
	ProcessorService processorService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createProcessor";
	}
	@RequestMapping("/saveProcessor")
	public String saveProcessor(@ModelAttribute("processor") Processor processor,
	@RequestParam("date") String date,
	ModelMap modelMap) throws
	ParseException
	{
	//conversion de la date
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	Date dateCreation = dateformat.parse(String.valueOf(date));
	processor.setDateCreation(dateCreation);
	Processor saveProcessor = processorService.saveProcessor(processor);
	String msg ="processor enregistré avec Id "+saveProcessor.getIdProcessor();
	modelMap.addAttribute("msg", msg);
	return "createProcessor";
	}
	@RequestMapping("/ListeProcessor")
	public String listeProcessor(ModelMap modelMap)
	{
	List<Processor> prods = processorService.getAllProcessor();
	modelMap.addAttribute("processor", prods);
	return "listeProcessor";
	}
	@RequestMapping("/supprimerProcessor")
	public String supprimerProcessor(@RequestParam("id") Long id,
	ModelMap modelMap)
	{
	processorService.deleteProcessorById(id);
	List<Processor> prods = processorService.getAllProcessor();
	modelMap.addAttribute("processor", prods);
	return "listeProcessor";
	}
	
	@RequestMapping("/modifierProcessor")
	public String editierProcessor(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Processor p= processorService.getProcessor(id);
	modelMap.addAttribute("processor", p);
	return "editierProcesseur";
	}
	@RequestMapping("/updateProcessor")
	public String updateProcessor(@ModelAttribute("processor") Processor processor,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		processor.setDateCreation(dateCreation);
		processorService.updateProcessor(processor);
		List<Processor> prods = processorService.getAllProcessor();
		modelMap.addAttribute("processor", prods);
		return "listeProcessor";
		}
	
	
}
