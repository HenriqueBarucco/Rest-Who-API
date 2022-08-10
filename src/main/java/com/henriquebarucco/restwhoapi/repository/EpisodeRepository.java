package com.henriquebarucco.restwhoapi.repository;

import com.henriquebarucco.restwhoapi.domain.Episode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends MongoRepository<Episode, String> {
}
