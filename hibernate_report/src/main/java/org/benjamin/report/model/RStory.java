package org.benjamin.report.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_story")
public class RStory implements Serializable{
	
	private static final long serialVersionUID = 8708238054603695240L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	@Column(name = "name")
    private String name;
	@Column(name = "path")
    private String path;
	@Column(name = "description")
    private String description;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "meta_id")
    private RMeta meta;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "narrative_id")
	private RNarrative narrative;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="givenStories")
//	@JoinColumn(name="story_id")
//	private List<RStory> givenStories = new ArrayList<RStory>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="story")
	private List<RScenario> scenarios = new ArrayList<RScenario>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public RMeta getMeta() {
		return meta;
	}
	public void setMeta(RMeta meta) {
		this.meta = meta;
	}
	public RNarrative getNarrative() {
		return narrative;
	}
	public void setNarrative(RNarrative narrative) {
		this.narrative = narrative;
	}
	public List<RScenario> getScenarios() {
		return scenarios;
	}
	public void setScenarios(List<RScenario> scenarios) {
		this.scenarios = scenarios;
	}
}
