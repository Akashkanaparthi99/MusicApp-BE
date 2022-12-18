package com.music.services;

import com.music.model.Song;

import java.util.List;

public interface ISongService {
    public void addSong(Song song);
    public void updateSong(Song song);
    public void deleteSong(int songId);
    public Song getById(int songId);
    public List<Song> getAll();
}
