package com.demo.dao.master;

import java.util.List;


import com.demo.entity.fam_tb_UploadSchemeOfSuit;

public interface fam_tb_UploadSchemeOfSuitDao {
    int insert(fam_tb_UploadSchemeOfSuit record);

    int insertSelective(fam_tb_UploadSchemeOfSuit record);
    
    List<fam_tb_UploadSchemeOfSuit> selectAllSuit();
}