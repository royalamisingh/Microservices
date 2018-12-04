package com.boot.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.bike.models.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long>{

}
