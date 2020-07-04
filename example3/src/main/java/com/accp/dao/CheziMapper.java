package com.accp.dao;

import com.accp.domain.Chezi;
import com.accp.domain.CheziExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheziMapper {
    int countByExample(CheziExample example);

    int deleteByExample(CheziExample example);

    int insert(Chezi record);

    int insertSelective(Chezi record);

    List<Chezi> selectByExample(CheziExample example);

    int updateByExampleSelective(@Param("record") Chezi record, @Param("example") CheziExample example);

    int updateByExample(@Param("record") Chezi record, @Param("example") CheziExample example);
}