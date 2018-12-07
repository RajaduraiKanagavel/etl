package com.xerago.cvm.etl.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etl_pipline_history")
public class PiplineHistory {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "pipline_id")
	private int piplineId;

	@Column(name = "execution_date")
	private Date executionDate;

	@Column(name = "status")
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPiplineId() {
		return piplineId;
	}

	public void setPiplineId(int piplineId) {
		this.piplineId = piplineId;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
