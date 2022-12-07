package com.music.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Song {
	@Id
	@GeneratedValue
	private Integer Id;
	@Column
	private String songName;
	@Column
	private double duration;
	 @ManyToMany
	 @JoinTable(name="SONG_ARTIST",
	        joinColumns=
	            @JoinColumn(name="SONG_ID"),
	        inverseJoinColumns=
	            @JoinColumn(name="ARTIST_ID")
	        )
	private List<Artist> artists;
	@ManyToOne
	@JoinColumn(name = "GENRE_ID")
	private Genre genre;
	@Column
	private LocalDateTime publishedOn;
	

}
