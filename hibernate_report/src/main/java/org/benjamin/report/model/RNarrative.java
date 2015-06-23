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
@Table(name="t_narrative")
public class RNarrative implements Serializable {
	private static final long serialVersionUID = -6906182790115864729L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	@Column(name = "in_order_to")
    private String inOrderTo;
	@Column(name = "as_a")
    private String asA;
	@Column(name = "i_want_to")
    private String iWantTo;
	@Column(name = "so_that")
    private String soThat;
	
	@OneToOne(mappedBy = "narrative")
	private RStory story;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInOrderTo() {
		return inOrderTo;
	}
	public void setInOrderTo(String inOrderTo) {
		this.inOrderTo = inOrderTo;
	}
	public String getAsA() {
		return asA;
	}
	public void setAsA(String asA) {
		this.asA = asA;
	}
	public String getiWantTo() {
		return iWantTo;
	}
	public void setiWantTo(String iWantTo) {
		this.iWantTo = iWantTo;
	}
	public String getSoThat() {
		return soThat;
	}
	public void setSoThat(String soThat) {
		this.soThat = soThat;
	}
}
