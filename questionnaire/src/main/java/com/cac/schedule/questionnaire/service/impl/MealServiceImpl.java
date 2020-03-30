package com.cac.schedule.questionnaire.service.impl;

import com.cac.schedule.questionnaire.bean.MealInfo;
import com.cac.schedule.questionnaire.bean.SheetInfo;
import com.cac.schedule.questionnaire.mapper.MealMapper;
import com.cac.schedule.questionnaire.mapper.SheetMapper;
import com.cac.schedule.questionnaire.service.MealService;
import com.cac.schedule.questionnaire.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MealServiceImpl implements MealService {

    @Autowired
    MealMapper mealMapper;


    @Override
    public List<MealInfo> getMealInfoListAll() {
        List<MealInfo> mealInfoList=mealMapper.mealListSelectAll();
        return mealInfoList;
    }

    @Override
    public void addMeal(MealInfo mealInfo) {
        mealMapper.mealInsert(mealInfo);

    }
}
