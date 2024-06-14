package com.wellnessapp.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wellnessapp.dto.WellnessPlanDTO;
import com.wellnessapp.service.WellnessPlanService;

@Service
public class WellnessPlanServiceImpl implements WellnessPlanService {

	@Override
	public WellnessPlanDTO createWellnessPlan(WellnessPlanDTO wellnessPlanDto) {
		// write your logic here
		return null;
	}

	@Override
	public Page<WellnessPlanDTO> getAllWellnessPlansByUserId(Long userId, Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public WellnessPlanDTO getWellnessPlanById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public WellnessPlanDTO updateWellnessPlan(Long id, WellnessPlanDTO wellnessPlanDto) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteWellnessPlan(Long id) {
		// write your logic here
		return false;
	}

	@Override
	public List<WellnessPlanDTO> filterWellnessPlansByType(Long userId, String planType) {
		// write your logic here
		return null;
	}

	@Override
	public WellnessPlanDTO updateWellnessPlanGoals(Long id, String goals) {
		// write your logic here
		return null;
	}

	@Override
	public List<WellnessPlanDTO> searchWellnessPlans(String keyword, LocalDate startDate) {
		// write your logic here
		return null;
	}

	@Override
	public WellnessPlanDTO extendWellnessPlanEndDate(Long id, LocalDate newEndDate) {
		// write your logic here
		return null;
	}

	@Override
	public List<WellnessPlanDTO> getUpcomingWellnessPlans() {
		// write your logic here
		return null;
	}
}
