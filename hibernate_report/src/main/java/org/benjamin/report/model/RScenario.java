package org.benjamin.report.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_scenario")
public class RScenario implements Serializable {
	private static final long serialVersionUID = 4214748228368343008L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "title")
    private String title;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "meta_id")
    private RMeta meta;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="story_id")
	private RStory story;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "examples_table_id")
    private RExamplesTable examplesTable;
	
	@ElementCollection
	@CollectionTable(name="t_scenario_step", joinColumns=@JoinColumn(name="scenario_id"))
	@Column(name="step")
    private List<String> steps = new ArrayList<String>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public RMeta getMeta() {
		return meta;
	}
	public void setMeta(RMeta meta) {
		this.meta = meta;
	}
	public RStory getStory() {
		return story;
	}
	public void setStory(RStory story) {
		this.story = story;
	}
	public RExamplesTable getExamplesTable() {
		return examplesTable;
	}
	public void setExamplesTable(RExamplesTable examplesTable) {
		this.examplesTable = examplesTable;
	}
	public List<String> getSteps() {
		return steps;
	}
	public void setSteps(List<String> steps) {
		this.steps = steps;
	}
}