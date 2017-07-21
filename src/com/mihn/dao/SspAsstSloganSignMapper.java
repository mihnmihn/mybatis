package com.mihn.dao;

import com.mihn.model.SspAsstSloganSign;

public interface SspAsstSloganSignMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SspAsstSloganSign record);

    int insertSelective(SspAsstSloganSign record);

    SspAsstSloganSign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SspAsstSloganSign record);

    int updateByPrimaryKey(SspAsstSloganSign record);
}