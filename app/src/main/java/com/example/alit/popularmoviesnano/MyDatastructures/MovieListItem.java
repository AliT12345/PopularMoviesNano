package com.example.alit.popularmoviesnano.MyDatastructures;

import android.graphics.Bitmap;

/**
 * Created by AliT on 9/18/17.
 */

public class MovieListItem {

    public static final String MOVIE_ID = "id";
    public static final String ORIGINAL_TITLE = "original_title";
    public static final String POSTER_PATH = "poster_path";
    public static final String POSTER = "poster";
    public static final String OVERVIEW = "overview";
    public static final String VOTE_AVERAGE = "vote_average";
    public static final String RELEASE_DATE = "release_date";

    public int movieID;
    public String title;
    public String posterURL;
    public Bitmap poster;
    public String plotSummary;
    public float userRating;
    public String releaseDate;

    public MovieListItem(int movieID, String title, String posterURL, String plotSummary, float userRating, String releaseDate) {
        this.movieID = movieID;
        this.title = title;
        this.posterURL = posterURL;
        this.plotSummary = plotSummary;
        this.userRating = userRating;
        this.releaseDate = releaseDate;
    }

    public MovieListItem(int movieID, String title, Bitmap poster, String plotSummary, float userRating, String releaseDate) {
        this.movieID = movieID;
        this.title = title;
        this.poster = poster;
        this.plotSummary = plotSummary;
        this.userRating = userRating;
        this.releaseDate = releaseDate;
    }

}
