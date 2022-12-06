package com.music.model;

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
}
