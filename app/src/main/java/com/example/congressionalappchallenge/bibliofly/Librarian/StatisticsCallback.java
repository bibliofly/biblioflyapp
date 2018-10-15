package com.example.congressionalappchallenge.bibliofly.Librarian;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sreeharirammohan on 2/7/18.
 */

public interface StatisticsCallback {
    void onCallback(int value);
    abstract void onCallback(long value);
    void onCallback(ArrayList<String[]> value);
    void onCallback(HashMap<String, Integer> value);

}
