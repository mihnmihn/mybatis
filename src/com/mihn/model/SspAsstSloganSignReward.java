package com.mihn.model;

import java.util.Date;

public class SspAsstSloganSignReward {
    private Long id;

    private Long sloganSignId;

    private Byte rewardType;

    private String rewardValue;

    private Date createdDate;

    private Date modifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSloganSignId() {
        return sloganSignId;
    }

    public void setSloganSignId(Long sloganSignId) {
        this.sloganSignId = sloganSignId;
    }

    public Byte getRewardType() {
        return rewardType;
    }

    public void setRewardType(Byte rewardType) {
        this.rewardType = rewardType;
    }

    public String getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(String rewardValue) {
        this.rewardValue = rewardValue == null ? null : rewardValue.trim();
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