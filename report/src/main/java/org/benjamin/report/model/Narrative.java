package org.benjamin.report.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Narrative {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String iWantTo;
	private String inOrderTO;
	private String asI;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getiWantTo() {
		return iWantTo;
	}
	public void setiWantTo(String iWantTo) {
		this.iWantTo = iWantTo;
	}
	public String getInOrderTO() {
		return inOrderTO;
	}
	public void setInOrderTO(String inOrderTO) {
		this.inOrderTO = inOrderTO;
	}
	public String getAsI() {
		return asI;
	}
	public void setAsI(String asI) {
		this.asI = asI;
	}
}
