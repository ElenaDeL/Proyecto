package com.dam2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam2.repository.PlaylistRepositorio;

@Service
public class PlaylistServicio implements IPlaylistServicio{
	
	@Autowired
	PlaylistRepositorio playlistRepositorio;

}
