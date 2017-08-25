package com.bignerdranch.android.beatbox;

/**
 * Created by tj on 8/24/17.
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound (String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssestPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
