package com.cac.schedule.questionnaire.mapper;

import com.cac.schedule.questionnaire.bean.MealInfo;
import com.cac.schedule.questionnaire.bean.SheetInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
//import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MealMapper {
    @Select("select * from 95_order_meal_list_test")
    public List<MealInfo> mealListSelectAll();
    @Insert("insert into 95_order_meal_list_test(identification_number,dept_code,meal_type,meal_num,get_meal_type,notes,status,create_time,update_time) values(#{idNum},#{deptCode},#{mealType},#{mealNum},#{getMealType},#{notes},#{status},#{createTime},#{updateTime})")
    public int mealInsert(MealInfo mealInfo);
}
