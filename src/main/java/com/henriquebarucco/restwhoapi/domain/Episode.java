package com.henriquebarucco.restwhoapi.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "episodes")
public class Episode implements Serializable {
    private String id;
    private String name;
    private Integer season;
    private Integer episode;
    private String released;
    private String plot;
    private Double rating;
    private String poster;
    private String thumb;
    private String magnet;

    public Episode() {
    }

    public Episode(String id, String name, Integer season, Integer episode, String released, String plot, Double rating, String poster, String thumb, String magnet) {
        this.id = id;
        this.name = name;
        this.season = season;
        this.episode = episode;
        this.released = released;
        this.plot = plot;
        this.rating = rating;
        this.poster = poster;
        this.thumb = thumb;
        this.magnet = magnet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getMagnet() {
        return magnet;
    }

    public void setMagnet(String magnet) {
        this.magnet = magnet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Episode episode = (Episode) o;
        return Objects.equals(id, episode.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
