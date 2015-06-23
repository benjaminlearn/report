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
@Table(name="t_examples_table")
public class RExamplesTable  implements Serializable{

	private static final long serialVersionUID = 901630480834912068L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	@OneToOne(mappedBy="examplesTable")
	private RScenario scenario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RScenario getScenario() {
		return scenario;
	}
	public void setScenario(RScenario scenario) {
		this.scenario = scenario;
	}
	
}
