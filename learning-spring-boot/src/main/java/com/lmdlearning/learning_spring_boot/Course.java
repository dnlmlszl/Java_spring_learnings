package com.lmdlearning.learning_spring_boot;

public class Course {
	private long id;
	private String name;
	private String author;
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
    public String toString() {
        return String.format("Course{id=%d, name='%s', author='%s'}", id, name, author);
    }

}
