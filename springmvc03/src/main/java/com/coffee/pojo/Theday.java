package com.coffee.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Theday {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
