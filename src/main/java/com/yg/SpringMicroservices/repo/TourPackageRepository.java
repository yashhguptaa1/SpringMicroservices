package com.yg.SpringMicroservices.repo;

import com.yg.SpringMicroservices.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    /**
     * Find Tour Package by name.
     *
     * @param name name of the package
     * @return Optional of TourPackage
     */
    Optional<TourPackage> findByName(String name);
}

