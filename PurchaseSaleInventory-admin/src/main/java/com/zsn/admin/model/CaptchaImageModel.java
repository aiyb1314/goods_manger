package com.zsn.admin.model;

import java.time.LocalDateTime;

public class CaptchaImageModel {
    private String code;

    private LocalDateTime expireTime;

    public CaptchaImageModel(String code, int expireAfterSeconds) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireAfterSeconds);
    }

    public String getCode() {
        return this.code;
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(this.expireTime);
    }
}