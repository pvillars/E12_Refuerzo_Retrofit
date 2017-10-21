package com.adacherSoft.unsplashy.models;

public class UnsplashUser {
    private int total_photos;
    private String twitter_username;
    private String last_name;
    private String bio;
    private int total_likes;
    private String portfolio_url;
    private UnsplashUserProfile_image profile_image;
    private String updated_at;
    private String name;
    private String location;
    private int total_collections;
    private UnsplashUserLinks links;
    private String id;
    private String first_name;
    private String username;

    public int getTotal_photos() {
        return this.total_photos;
    }

    public void setTotal_photos(int total_photos) {
        this.total_photos = total_photos;
    }

    public String getTwitter_username() {
        return this.twitter_username;
    }

    public void setTwitter_username(String twitter_username) {
        this.twitter_username = twitter_username;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getTotal_likes() {
        return this.total_likes;
    }

    public void setTotal_likes(int total_likes) {
        this.total_likes = total_likes;
    }

    public String getPortfolio_url() {
        return this.portfolio_url;
    }

    public void setPortfolio_url(String portfolio_url) {
        this.portfolio_url = portfolio_url;
    }

    public UnsplashUserProfile_image getProfile_image() {
        return this.profile_image;
    }

    public void setProfile_image(UnsplashUserProfile_image profile_image) {
        this.profile_image = profile_image;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotal_collections() {
        return this.total_collections;
    }

    public void setTotal_collections(int total_collections) {
        this.total_collections = total_collections;
    }

    public UnsplashUserLinks getLinks() {
        return this.links;
    }

    public void setLinks(UnsplashUserLinks links) {
        this.links = links;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
