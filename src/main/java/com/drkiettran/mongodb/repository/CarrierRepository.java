package com.drkiettran.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.drkiettran.mongodb.model.Carrier;

@Repository
public interface CarrierRepository extends MongoRepository<Carrier, String> {

	@Query("{Code:'?0'}")
	Carrier findByCode(@Param("code") String code);

}
