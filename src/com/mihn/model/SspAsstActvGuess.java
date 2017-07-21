package com.mihn.model;

import java.util.Date;

public class SspAsstActvGuess {
    private Long id;

    private String title;

    private String content;

    private String firstTip;

    private String secondTip;

    private String answer;

    private Long sku;

    private Boolean contentType;

    private Boolean state;

    private String yn;

    private Date createdDate;

    private Date modifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getFirstTip() {
        return firstTip;
    }

    public void setFirstTip(String firstTip) {
        this.firstTip = firstTip == null ? null : firstTip.trim();
    }

    public String getSecondTip() {
        return secondTip;
    }

    public void setSecondTip(String secondTip) {
        this.secondTip = secondTip == null ? null : secondTip.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public Boolean getContentType() {
        return contentType;
    }

    public void setContentType(Boolean contentType) {
        this.contentType = contentType;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getYn() {
        return yn;
    }

    public void setYn(String yn) {
        this.yn = yn == null ? null : yn.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}