package com.cac.schedule.questionnaire.service;

import com.cac.schedule.questionnaire.bean.MealInfo;
import com.cac.schedule.questionnaire.bean.SheetInfo;

import java.util.List;

public interface SheetService {
    List<SheetInfo> getSheetInfoListAll();

    void addSheet(SheetInfo sheetInfo);
    void updateSheet(SheetInfo sheetInfo);
    void deleteSheet(SheetInfo sheetInfo);

}
