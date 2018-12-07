package com.xerago.cvm.etl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "etl_pipline")
public class Pipline {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "source_database_id")
	private int sourceDatabaseId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "source_database_id", insertable=false, updatable=false)
	private Database sourceDatabase;

	@Column(name = "source_query")
	private String sourceQuery;

	@Column(name = "target_database_id")
	private int targetDatabaseId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "target_database_id", insertable=false, updatable=false)
	private Database targetDatabase;

	@Column(name = "target_query")
	private String targetQuery;

	@Column(name = "active")
	private int active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSourceDatabaseId() {
		return sourceDatabaseId;
	}

	public void setSourceDatabaseId(int sourceDatabaseId) {
		this.sourceDatabaseId = sourceDatabaseId;
	}

	public Database getSourceDatabase() {
		return sourceDatabase;
	}

	public void setSourceDatabase(Database sourceDatabase) {
		this.sourceDatabase = sourceDatabase;
	}

	public String getSourceQuery() {
		return sourceQuery;
	}

	public void setSourceQuery(String sourceQuery) {
		this.sourceQuery = sourceQuery;
	}

	public int getTargetDatabaseId() {
		return targetDatabaseId;
	}

	public void setTargetDatabaseId(int targetDatabaseId) {
		this.targetDatabaseId = targetDatabaseId;
	}

	public Database getTargetDatabase() {
		return targetDatabase;
	}

	public void setTargetDatabase(Database targetDatabase) {
		this.targetDatabase = targetDatabase;
	}

	public String getTargetQuery() {
		return targetQuery;
	}

	public void setTargetQuery(String targetQuery) {
		this.targetQuery = targetQuery;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}
