package com.cac.schedule.questionnaire.service.impl;

import com.cac.schedule.questionnaire.bean.SheetInfo;
import com.cac.schedule.questionnaire.mapper.SheetMapper;
import com.cac.schedule.questionnaire.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SheetServiceImpl implements SheetService {

    @Autowired
    SheetMapper sheetMapper;

    @Override
    public List<SheetInfo> getSheetInfoListAll() {
        List<SheetInfo> sheetInfoList=sheetMapper.selectAll();
        return sheetInfoList;
    }

    @Override
    public void addSheet(SheetInfo sheetInfo) {
        sheetMapper.insertSelective(sheetInfo);

    }

    @Override
    public void updateSheet(SheetInfo sheetInfo) {

    }

    @Override
    public void deleteSheet(SheetInfo sheetInfo) {

    }
}
