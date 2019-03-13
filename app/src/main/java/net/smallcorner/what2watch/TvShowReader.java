package net.smallcorner.what2watch;

import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class TvShowReader {

    public ArrayList<TvShow> allShows() throws UnsupportedEncodingException {
        ArrayList<TvShow> tvShows = new ArrayList<>();

        for (int i=0; i<=100; i++) {
            AssetManager assetManager = getAssets();
            InputStream is = assets.get(w2wdata.tsv); // gets an inputstream from asset w2wdata.tsv (binary)
            Reader r = new InputStreamReader(is, "UTF-8"); // wraps is into UTF-8 format (text)
            BufferedReader in = new BufferedReader(r); // regular Reader, but line-by-line (line)
            String s = in.readLine(); // reads the one line of String text from BufferedReader
            s.split('\t'); // splits data at each tab
        }
        return tvShows;
    }
}
