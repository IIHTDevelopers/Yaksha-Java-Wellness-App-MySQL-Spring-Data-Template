package com.wellnessapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellnessapp.entity.WellnessPlan;

@Repository
public interface WellnessPlanRepository extends JpaRepository<WellnessPlan, Long> {
	/**
	 * Fetches a paginated list of WellnessPlan entities for a given user ID, sorted
	 * by plan type in ascending order.
	 */

	// Method to find wellness plans with a start date greater than or equal to a
	// specified date
}
