package com.bharatpebuddies.bharatpebuddies.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "daily_news_feed")
public class DailyNewsFeed extends BaseEntity{

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "url_to_image")
    private String urlToImage;

    @Column(name = "published_at")
    private String publishedAt;

    @Column(name = "content")
    private String content;
}
