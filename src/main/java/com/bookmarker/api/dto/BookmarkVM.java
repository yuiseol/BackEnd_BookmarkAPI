package com.bookmarker.api.dto;

import java.time.Instant;

//View Model
public interface BookmarkVM {
    Long getId();
    String getTitle();
    String getUrl();
    Instant getCreatedAt();
}