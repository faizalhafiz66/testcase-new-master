package com.Javabootcamp.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="film")
public class filmModel {

	@Id
	@Column(name="film_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int film_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@DateTimeFormat(pattern="yyyy")
	@Column(name="release_year")
	private Date releaseyear;
	
	@Column(name="language_id")
	private int languageid;
	
	public filmModel() {
		
	}

	public filmModel(String title, String description, Date releaseyear, int languageid) {
		this.title = title;
		this.description = description;
		this.releaseyear = releaseyear;
		this.languageid = languageid;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(Date releaseyear) {
		this.releaseyear = releaseyear;
	}

	public int getLanguageid() {
		return languageid;
	}

	public void setLanguageid(int languageid) {
		this.languageid = languageid;
	}

	@Override
	public String toString() {
		return "filmModel [film_id=" + film_id + ", title=" + title + ", description=" + description + ", releaseyear="
				+ releaseyear + ", languageid=" + languageid + "]";
	}
	
	
	
	
	
	
}
