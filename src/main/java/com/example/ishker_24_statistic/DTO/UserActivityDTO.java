package com.example.ishker_24_statistic.DTO;


import java.util.Date;

public class UserActivityDTO {
    private Long id;
    private Long userId;
    private Date loginTimestamp;
    private Date logoutTimestamp;

    public UserActivityDTO() {
    }

    public UserActivityDTO(Long id, Long userId, Date loginTimestamp, Date logoutTimestamp) {
        this.id = id;
        this.userId = userId;
        this.loginTimestamp = loginTimestamp;
        this.logoutTimestamp = logoutTimestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTimestamp() {
        return loginTimestamp;
    }

    public void setLoginTimestamp(Date loginTimestamp) {
        this.loginTimestamp = loginTimestamp;
    }

    public Date getLogoutTimestamp() {
        return logoutTimestamp;
    }

    public void setLogoutTimestamp(Date logoutTimestamp) {
        this.logoutTimestamp = logoutTimestamp;
    }
}