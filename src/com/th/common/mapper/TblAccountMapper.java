package com.th.common.mapper;

import com.th.common.entity.TblAccount;

public interface TblAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TblAccount record);

    int insertSelective(TblAccount record);

    TblAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblAccount record);

    int updateByPrimaryKey(TblAccount record);
}