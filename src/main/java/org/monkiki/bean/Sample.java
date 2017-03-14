package org.monkiki.bean;

/**
 * Created by pavila on 17/06/16.
 */
public class Sample {
	private long id;
	private String name;

	public Sample(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sample{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
