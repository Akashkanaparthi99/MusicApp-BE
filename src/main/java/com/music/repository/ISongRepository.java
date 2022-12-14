package com.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.model.Song;

@Repository
public interface ISongRepository extends JpaRepository<Song, Integer>{

}
