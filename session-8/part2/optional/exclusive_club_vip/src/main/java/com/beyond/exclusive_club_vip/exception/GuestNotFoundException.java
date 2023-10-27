package com.beyond.exclusive_club_vip.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.NoSuchElementException;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GuestNotFoundException extends NoSuchElementException {
}
