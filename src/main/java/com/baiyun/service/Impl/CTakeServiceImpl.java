package com.baiyun.service.Impl;

import com.baiyun.entity.ReportVo;
import com.baiyun.mapper.CTakeMapper;
import com.baiyun.service.CTakeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class CTakeServiceImpl implements CTakeService {
    @Resource
    private CTakeMapper cTakeMapper;
    //查看交过费没取药的患者
    @Override
    public List<ReportVo> sel() {
        return cTakeMapper.sel();
    }
    //修改用户状态
    @Override
    public Integer chuku(ReportVo reportVo) {
        return cTakeMapper.chuku(reportVo);
    }
    //查看交过费取过要的患者
    @Override
    public List<ReportVo> selhuan(ReportVo reportVo) {
        return cTakeMapper.selhuan(reportVo);
    }

    @Override
    public List<ReportVo> selceshia(ReportVo reportVo) {
        return cTakeMapper.selceshia(reportVo);
    }

    @Override
    public List<ReportVo> selceshib(ReportVo reportVo) {
        return cTakeMapper.selceshib(reportVo);
    }

    //查询该用户的总价钱
    @Override
    public int zong(Integer reid) {
        return cTakeMapper.zong(reid);
    }
}
