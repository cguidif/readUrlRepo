package com.apitest.models;

public class UrlModel {
	
	Integer rank;
	String item;
	String repo_name;
	Integer stars;
	Integer forks;
	String language;
	String repo_url;
	String username;
	Integer issues;
	String last_commit;
	String description;

	
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getRepo_name() {
		return repo_name;
	}
	public void setRepo_name(String repo_name) {
		this.repo_name = repo_name;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	public Integer getForks() {
		return forks;
	}
	public void setForks(Integer forks) {
		this.forks = forks;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRepo_url() {
		return repo_url;
	}
	public void setRepo_url(String repo_url) {
		this.repo_url = repo_url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getIssues() {
		return issues;
	}
	public void setIssues(Integer issues) {
		this.issues = issues;
	}
	public String getLast_commit() {
		return last_commit;
	}
	public void setLast_commit(String last_commit) {
		this.last_commit = last_commit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String toString() {
		return 
			this.rank+ ", " +
			this.item+ ", " +
			this.repo_name+ ", " +
			this.stars+ ", " +
			this.forks+ ", " +
			this.language+ ", " +
			this.repo_url+ ", " +
			this.username+ ", " +
			this.issues+ ", " +
			this.last_commit+ ", " +
			this.description;
	}

}
