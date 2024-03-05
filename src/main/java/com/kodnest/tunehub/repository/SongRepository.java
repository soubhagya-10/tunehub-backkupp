package com.kodnest.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer>{

	public String existsByNameAndArtist(String name, String artist);

	public Song findByName(String name);

}
