package com.yg.SpringMicroservices.repo;

import com.yg.SpringMicroservices.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}