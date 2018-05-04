package com.th.common.mapper;

import com.th.common.entity.TblTalk;

public interface TblTalkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TblTalk record);

    int insertSelective(TblTalk record);

    TblTalk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblTalk record);

    int updateByPrimaryKey(TblTalk record);
}