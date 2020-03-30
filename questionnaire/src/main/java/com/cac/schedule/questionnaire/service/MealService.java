package com.cac.schedule.questionnaire.service;

import com.cac.schedule.questionnaire.bean.MealInfo;
import com.cac.schedule.questionnaire.bean.SheetInfo;

import java.util.List;

public interface MealService {

    List<MealInfo>getMealInfoListAll();
    void addMeal(MealInfo mealInfo);
}
