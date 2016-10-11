package com.simplerssreader;

/**
 * A representation of an rss item from the list.
 * 
 *
 * 
 */
public class RssItem {

	private final String title;
	private final String link;
	private final String copyright;

	public RssItem(String title, String link, String image) {
		this.title = title;
		this.link = link;
		this.copyright = image;
	}

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getImage() {return copyright; }
}
