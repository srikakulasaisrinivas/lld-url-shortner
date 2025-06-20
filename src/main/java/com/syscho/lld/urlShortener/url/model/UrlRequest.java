package com.syscho.lld.urlShortener.url.model;

import lombok.Data;

@Data
public class UrlRequest {

    private String originalUrl;
    private String customAlias;
    private Long expiryInMinutes;
    private Integer length;
    private String password;
    private boolean isQrNeeded;
}
