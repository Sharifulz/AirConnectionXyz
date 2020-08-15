package com.air.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_admin")
@Entity
public class AdminModel {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String adminName;
	
	@Column
	private String username;
	
	@Column
	private String adminFatherName;
	
	@Column
	private String adminMotherName;
	
	@Column
	private int adminAge;
	
	@Column
	private Date adminDob;
	
	@Column(columnDefinition = "boolean default false")
	private boolean isActive;
	
	@Column
	private String adminPassword;
	
	@Column
	private String adminImages;
	
	@Column
	private Date createdAt;
	
	@Column
	private Date updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAdminFatherName() {
		return adminFatherName;
	}

	public void setAdminFatherName(String adminFatherName) {
		this.adminFatherName = adminFatherName;
	}

	public String getAdminMotherName() {
		return adminMotherName;
	}

	public void setAdminMotherName(String adminMotherName) {
		this.adminMotherName = adminMotherName;
	}

	public int getAdminAge() {
		return adminAge;
	}

	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}

	public Date getAdminDob() {
		return adminDob;
	}

	public void setAdminDob(Date adminDob) {
		this.adminDob = adminDob;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminImages() {
		return adminImages;
	}

	public void setAdminImages(String adminImages) {
		this.adminImages = adminImages;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public AdminModel() {
	}
	
	
}
