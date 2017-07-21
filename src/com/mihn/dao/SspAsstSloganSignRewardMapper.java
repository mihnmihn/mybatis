package com.mihn.dao;

import com.mihn.model.SspAsstSloganSignReward;

public interface SspAsstSloganSignRewardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SspAsstSloganSignReward record);

    int insertSelective(SspAsstSloganSignReward record);

    SspAsstSloganSignReward selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SspAsstSloganSignReward record);

    int updateByPrimaryKey(SspAsstSloganSignReward record);
}