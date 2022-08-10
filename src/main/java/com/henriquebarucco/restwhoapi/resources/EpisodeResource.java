package com.henriquebarucco.restwhoapi.resources;

import com.henriquebarucco.restwhoapi.domain.Episode;
import com.henriquebarucco.restwhoapi.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/episodes")
public class EpisodeResource {

    @Autowired
    private EpisodeService episodeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Episode>> findAll() {
        List<Episode> list = episodeService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
