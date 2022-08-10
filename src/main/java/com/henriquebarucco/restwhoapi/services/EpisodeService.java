package com.henriquebarucco.restwhoapi.services;

import com.henriquebarucco.restwhoapi.domain.Episode;
import com.henriquebarucco.restwhoapi.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;

    public List<Episode> findAll() {
        return episodeRepository.findAll();
    }

    public Episode findByEpisodeAndSeason(String episode, String season) {
        return episodeRepository.searchByEpisodeAndSeason(episode, season);
    }
}
