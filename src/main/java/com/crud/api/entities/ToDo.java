package com.crud.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todo")
public class ToDo {

	@Id
	private String id;
	private String taskName;
	private String taskDetails;
	private boolean taskStatus;
	
	public ToDo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param taskName
	 * @param taskDetails
	 * @param taskStatus
	 */
	public ToDo(String id, String taskName, String taskDetails, boolean taskStatus) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDetails = taskDetails;
		this.taskStatus = taskStatus;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the taskDetails
	 */
	public String getTaskDetails() {
		return taskDetails;
	}

	/**
	 * @param taskDetails the taskDetails to set
	 */
	public void setTaskDetails(String taskDetails) {
		this.taskDetails = taskDetails;
	}

	/**
	 * @return the taskStatus
	 */
	public boolean isTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(boolean taskStatus) {
		this.taskStatus = taskStatus;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", taskName=" + taskName + ", taskDetails=" + taskDetails + ", taskStatus="
				+ taskStatus + "]";
	}
	
	
}
