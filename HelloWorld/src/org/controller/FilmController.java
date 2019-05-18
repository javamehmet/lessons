package org.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.service.FilmDTO;
import org.service.FilmService;

import com.google.common.collect.Multiset.Entry;

@ManagedBean(name = "filmController")
@RequestScoped
public class FilmController {

	private List<FilmDTO> filmListesi;

	public FilmController() {

		filmListesi = new ArrayList<FilmDTO>();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		FilmService filmService = new FilmService();

		Map<String, FilmDTO> mapList = filmService.getList();

		for (Map.Entry<String, FilmDTO> entry : mapList.entrySet()) {
			filmListesi.add(entry.getValue());
		}

	}

	public List<FilmDTO> getFilmListesi() {
		return filmListesi;
	}

	public void setFilmListesi(List<FilmDTO> filmListesi) {
		this.filmListesi = filmListesi;
	}
	
	

}
