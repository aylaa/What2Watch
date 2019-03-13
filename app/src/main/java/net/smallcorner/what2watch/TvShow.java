package net.smallcorner.what2watch;

public class TvShow {

    public String tconst;
    public String titleType;
    public String primaryTitle;
    public String originalTitle;
    public boolean isAdult;
    public int startYear;
    public int endYear;
    public int runtimeMinutes;
    public String[] genres;

    public TvShow(String tcon, String tType, String pTitle, String oTitle, boolean iAdult, int sYear,
                  int eYear, int rMinutes, String[] g) {
        setTconst(tcon);
        setTitleType(tType);
        setPrimaryTitle(pTitle);
        setOriginalTitle(oTitle);
        setAdult(iAdult);
        setStartYear(sYear);
        setEndYear(eYear);
        setRuntimeMinutes(rMinutes);
        setGenres(g);
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}