package com.mihn.dao;

import com.mihn.model.SspAsstActvGuess;

public interface SspAsstActvGuessMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SspAsstActvGuess record);

    int insertSelective(SspAsstActvGuess record);

    SspAsstActvGuess selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SspAsstActvGuess record);

    int updateByPrimaryKey(SspAsstActvGuess record);
}