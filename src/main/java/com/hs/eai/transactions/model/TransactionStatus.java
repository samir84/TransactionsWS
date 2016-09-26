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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.search.annotations.DocumentId;

@Entity
@Table(name="Transaction_status")
@NamedQueries({
	@NamedQuery(name = "CustomerSync.findAll", query = "SELECT o FROM CustomerSync o"),
	@NamedQuery(name = "CustomerSync.findByOrderNumber", query = "SELECT o FROM CustomerSync o where o.orderNumber=:orderNumber"),
	
})
public class TransactionStatus implements java.io.Serializable {

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
	@ManyToOne
	@JoinColumn(name = "transaction_status_id" ,nullable=false)
	private Set mails = new HashSet(0);
	@OneToMany
	@JoinColumn(name = "transaction_status_id" ,nullable=false)
	private Set msmqgwSendToMsmqs = new HashSet(0);
	@OneToMany
	@JoinColumn(name = "transaction_status_id" ,nullable=false)
	private Set msmqgwReceiveFromMsmqs = new HashSet(0);
	@OneToMany
	@JoinColumn(name = "transaction_status_id" ,nullable=false)
	private Set customerSyncs = new HashSet(0);

	public TransactionStatus() {
	}

	public TransactionStatus(int id, String code, String description, Boolean active) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.active = active;
	}

	public TransactionStatus(int id, String code, String description, Boolean active, Set mails, Set msmqgwSendToMsmqs, Set msmqgwReceiveFromMsmqs, Set customerSyncs) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.active = active;
		this.mails = mails;
		this.msmqgwSendToMsmqs = msmqgwSendToMsmqs;
		this.msmqgwReceiveFromMsmqs = msmqgwReceiveFromMsmqs;
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

	public Set getMails() {
		return this.mails;
	}

	public void setMails(Set mails) {
		this.mails = mails;
	}

	public Set getMsmqgwSendToMsmqs() {
		return this.msmqgwSendToMsmqs;
	}

	public void setMsmqgwSendToMsmqs(Set msmqgwSendToMsmqs) {
		this.msmqgwSendToMsmqs = msmqgwSendToMsmqs;
	}

	public Set getMsmqgwReceiveFromMsmqs() {
		return this.msmqgwReceiveFromMsmqs;
	}

	public void setMsmqgwReceiveFromMsmqs(Set msmqgwReceiveFromMsmqs) {
		this.msmqgwReceiveFromMsmqs = msmqgwReceiveFromMsmqs;
	}

	public Set getCustomerSyncs() {
		return this.customerSyncs;
	}

	public void setCustomerSyncs(Set customerSyncs) {
		this.customerSyncs = customerSyncs;
	}

}
*/