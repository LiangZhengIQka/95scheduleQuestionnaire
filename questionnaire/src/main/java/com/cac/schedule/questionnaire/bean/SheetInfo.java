package com.cac.schedule.questionnaire.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Table(name="95_schedule_questionnaire")
public class SheetInfo implements Serializable {

    @Column(name="id")
    private int id;
    @Column(name="dept")
    private String dept;
    @Column(name="gender")
    private String gender;
    @Column(name="job_category")
    private String jobCategory;
    @Column(name="age")
    private String age;
    @Column(name="marriage")
    private String marriage;
    @Column(name="is_both")
    private String isBoth;
    @Column(name="children")
    private String children;
    @Column(name="residence_preferred")
    private String residencePreferred;
    @Column(name="residence_preferred_region")
    private String residencePreferredRegion;
    @Column(name="residence_alternative")
    private String residenceAlternative;
    @Column(name="residence_alternative_region")
    private String residenceAlternativeRegion;
    @Column(name="distance")
    private String distance;
    @Column(name="time_on_duty")
    private String timeOnDuty;
    @Column(name="time_off_duty")
    private String timeOffDuty;
    @Column(name="trans_preferred")
    private String transPreferred;
    @Column(name="trans_alternative")
    private String transAlternative;
    @Column(name="is_metro9")
    private String isMetro9;
    @Column(name="meal_preferred")
    private String mealPreferred;
    @Column(name="meal_alternative")
    private String mealAlternative;
    @Column(name="lunch_break")
    private String lunchBreak;
    @Column(name="is_siesta")
    private String isSiesta;
    @Column(name="time_siesta")
    private String timeSiesta;
    @Column(name="schedule_preferred")
    private String schedulePreferred;
    @Column(name="is_consent")
    private String isConsent;
    @Column(name="activities")
    private String activities;

}
