package com.github.andrebdavis.Pages;

import org.apache.commons.lang3.RandomStringUtils;

public class MetaDataUtility {
    public static String createRandomName(){
        return RandomStringUtils.randomAlphabetic(5);
    }
}