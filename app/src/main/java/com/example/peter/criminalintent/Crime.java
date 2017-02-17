package com.example.peter.criminalintent;

import java.util.UUID;
import java.util.logging.StreamHandler;

/**
 * Created by peter on 2/17/17.
 */
public class Crime {
    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime(){

        // Generate unique identifier
        mId = UUID.randomUUID();
    }
}
