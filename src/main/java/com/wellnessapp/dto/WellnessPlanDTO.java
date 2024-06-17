package com.wellnessapp.dto;

import java.time.LocalDate;

public class WellnessPlanDTO {
	private Long id;
	private Long userId;

	private String planType;

	private String description;

	private String goals;

	private LocalDate startDate;

	private LocalDate endDate;

	public WellnessPlanDTO() {
	}

	public WellnessPlanDTO(Long id, Long userId, String planType, String description, String goals, LocalDate startDate,
			LocalDate endDate) {
		this.id = id;
		this.userId = userId;
		this.planType = planType;
		this.description = description;
		this.goals = goals;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public WellnessPlanDTO(String planType, String description, String goals, LocalDate startDate, LocalDate endDate) {
		this.planType = planType;
		this.description = description;
		this.goals = goals;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
