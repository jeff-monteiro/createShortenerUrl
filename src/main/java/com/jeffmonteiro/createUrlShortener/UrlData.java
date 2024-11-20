package com.jeffmonteiro.createUrlShortener;


import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;


@AllArgsConstructor
@Setter
@Getter
public class UrlData {

    private String originalUrl;
    private long expirationTime;


}
