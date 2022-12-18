package com.music.services;

import com.music.model.Song;
import com.music.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl  implements ISongService{

    private ISongRepository repository;
    @Autowired
    public void setRepository(ISongRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addSong(Song song) {
        repository.save(song);
    }

    @Override
    public void updateSong(Song song) {
        repository.save(song);
    }

    @Override
    public void deleteSong(int songId) {
        repository.deleteById(songId);
    }

    @Override
    public Song getById(int songId) {
        return repository.findById(songId).get();
    }

    @Override
    public List<Song> getAll() {
        return repository.findAll()     ;
    }
}
