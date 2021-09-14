package com.example.project09.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INVALID_PASSWORD(401, "Invalid Password"),
    INVALID_TOKEN(401, "Invalid Token"),

    USER_ALREADY_EXISTS(409, "User Already Exists"),
    USER_NOT_FOUND(404, "User Not Found"),

    POST_NOT_FOUND(404, "Post Not Found"),
    IMAGE_NOT_FOUND(404, "Image Not Found"),

    LIKE_NOT_FOUND(404, "Like Not Found"),
    LIKE_ALREADY_EXISTS(409, "Like Already Exists");

    private final int status;
    private final String message;

}
