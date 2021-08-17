package com.springbatch.dao;

import com.springbatch.dto.NTS.Company;
import com.springbatch.dto.NTS.CompanyChangeGubun;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class SendNTSDao {


    @Resource(name = "sqlSessionNTS")
    private SqlSessionTemplate sqlSessionNTS;

    public List<Company> batchNTSExcelListForCard() {
        return this.sqlSessionNTS.selectList("batchNTSExcelListForCard");
    }

    public List<CompanyChangeGubun> batchNTSExcelListForCash() {
        return this.sqlSessionNTS.selectList("batchNTSExcelListForCash");
    }
}
