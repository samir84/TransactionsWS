/*package com.hs.eai.transactions.model;

// Generated 3-aug-2012 15:31:07 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.search.annotations.DocumentId;



@Entity
@Table(name="Message_type")
@NamedQueries({
	@NamedQuery(name = "CustomerSync.findAll", query = "SELECT o FROM CustomerSync o"),
	@NamedQuery(name = "CustomerSync.findByOrderNumber", query = "SELECT o FROM CustomerSync o where o.orderNumber=:orderNumber"),
	
})
public class MessageType implements java.io.Serializable {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = -5204916092936772401L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@DocumentId
	@Column(name="ID",columnDefinition="numeric")
	private Integer id;
	private String code;
	private String description;
	private Boolean active;
	@OneToMany
	@JoinColumn(name = "message_type_id" ,nullable=false)
	private Set<CustomerSync> customerSyncs = new HashSet<CustomerSync>();

	public MessageType() {
	}

	public MessageType(int id, String code, String description, Boolean active) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.active = active;
	}

	public MessageType(int id, String code, String description, Boolean active, Set<CustomerSync> customerSyncs) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.active = active;
		this.customerSyncs = customerSyncs;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Set<CustomerSync> getCustomerSyncs() {
		return this.customerSyncs;
	}

	public void setCustomerSyncs(Set<CustomerSync> customerSyncs) {
		this.customerSyncs = customerSyncs;
	}

}
*/