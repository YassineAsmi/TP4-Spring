package com.yassine.processor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProcessor;
	private String nomProcessor;
	private String modelProcessor;
	private Double prixProcessor;
	private Date dateCreation;
	
	public Processor() {
		super();
		}

	public Processor(String nomProcessor, String modelProcessor, Double prixProcessor, Date dateCreation) {
		super();
		this.nomProcessor = nomProcessor;
		this.modelProcessor = modelProcessor;
		this.prixProcessor = prixProcessor;
		this.dateCreation = dateCreation;
	}

	public Long getIdProcessor() {
		return idProcessor;
	}

	public void setIdProcessor(Long idProcessor) {
		this.idProcessor = idProcessor;
	}

	public String getNomProcessor() {
		return nomProcessor;
	}

	public void setNomProcessor(String nomProcessor) {
		this.nomProcessor = nomProcessor;
	}

	public String getModelProcessor() {
		return modelProcessor;
	}

	public void setModelProcessor(String modelProcessor) {
		this.modelProcessor = modelProcessor;
	}

	public Double getPrixProcessor() {
		return prixProcessor;
	}

	public void setPrixProcessor(Double prixProcessor) {
		this.prixProcessor = prixProcessor;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Processor [idProcessor=" + idProcessor + ", nomProcessor=" + nomProcessor + ", modelProcessor="
				+ modelProcessor + ", prixProcessor=" + prixProcessor + ", dateCreation=" + dateCreation + "]";
	}
	
}
