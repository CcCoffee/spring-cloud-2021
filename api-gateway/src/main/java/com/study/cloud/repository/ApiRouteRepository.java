package com.study.cloud.repository;

import com.study.cloud.model.database.ApiRoute;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ApiRouteRepository extends ReactiveCrudRepository<ApiRoute, Long> {
  
}
