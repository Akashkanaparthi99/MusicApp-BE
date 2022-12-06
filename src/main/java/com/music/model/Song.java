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
	
	private List<Artist> artists;
	
	private Genre genre;
	@Column
	private LocalDateTime publishedOn;
	

}
