package org.benjamin.report.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_meta")
public class RMeta implements Serializable{
	private static final long serialVersionUID = 6995610649942486079L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@OneToOne(mappedBy="meta")
	private RStory story;
	@OneToOne(mappedBy="meta")
	private RScenario scenario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RStory getStory() {
		return story;
	}
	public void setStory(RStory story) {
		this.story = story;
	}
	public RScenario getScenario() {
		return scenario;
	}
	public void setScenario(RScenario scenario) {
		this.scenario = scenario;
	}
	
}
