package com.cac.schedule.questionnaire.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Table(name="95_order_meal_list_test")
public class MealInfo implements Serializable {

    @Column(name="id")
    private int id;
    @Column(name="identification_number")
    private String identification_number;
    @Column(name="dept_code")
    private  String dept_code;
    @Column(name="meal_type")
    private  String meal_type;
    @Column(name="meal_num")
    private  String meal_num;
    @Column(name="get_meal_type")
    private  String get_meal_type;
    @Column(name="notes")
    private  String notes;
    @Column(name="status")
    private  String status;
    @Column(name="create_time")
    private  String create_time;
    @Column(name="update_time")
    private  String update_time;

}
