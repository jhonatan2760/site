package com.jhonatansouza.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "tag_seq", sequenceName = "tag_seq", allocationSize =1, initialValue= 1)
public class Tag implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private List<Post> posts;
	
	@Id
	@GeneratedValue(generator="tag_seq", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany
	@JoinTable(name="POST_TAG", 
		joinColumns = {@JoinColumn(name = "tag_id")},
		inverseJoinColumns = {@JoinColumn(name = "post_id")}
		)
	public List<Post> getPosts() {
		return posts;
	}
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
}
