package com.mps.vibestemptation.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String icon;

	@Lob
	@Column(name="long_description")
	private String longDescription;

	private String name;

	private float pricing;

	private byte published;

	@Column(name="rating_cache")
	private float ratingCache;

	@Column(name="rating_count")
	private int ratingCount;

	@Column(name="short_description")
	private String shortDescription;

	public Product() {
	}
	
	public Product(String name, float pricing, byte published, String icon, float ratingCache, int ratingCount, String shortDescription, String longDescription){
		setName(name);
		setPricing(pricing);
		setPublished(published);
		setIcon(icon);
		setRatingCache(ratingCache);
		setRatingCount(ratingCount);
		setShortDescription(shortDescription);
		setLongDescription(longDescription);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPricing() {
		return this.pricing;
	}

	public void setPricing(float pricing) {
		this.pricing = pricing;
	}

	public byte getPublished() {
		return this.published;
	}

	public void setPublished(byte published) {
		this.published = published;
	}

	public float getRatingCache() {
		return this.ratingCache;
	}

	public void setRatingCache(float ratingCache) {
		this.ratingCache = ratingCache;
	}

	public int getRatingCount() {
		return this.ratingCount;
	}

	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

}