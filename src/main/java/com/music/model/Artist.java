package com.music.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Artist {
	@Id
	@GeneratedValue
	private Integer Id;
	@Column
	private String artistName;
	@ManyToMany(mappedBy = "artists")
	private List<Song> songs;
}
