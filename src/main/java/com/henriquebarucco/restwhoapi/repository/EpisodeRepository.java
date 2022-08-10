package com.henriquebarucco.restwhoapi.repository;

import com.henriquebarucco.restwhoapi.domain.Episode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepository extends MongoRepository<Episode, String> {

    @Query(" { $and:  [ { 'episode':  {$eq:  ?0}}, { 'season':  {$eq:  ?1} } ] } ")
    Episode searchByEpisodeAndSeason(String episode, String season);
}
