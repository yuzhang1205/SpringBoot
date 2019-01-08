package com.demo.dao;

import com.demo.entity.pr_t_Operator;

public interface pr_t_OperatorMapper {
    int insert(pr_t_Operator record);

    int insertSelective(pr_t_Operator record);
}