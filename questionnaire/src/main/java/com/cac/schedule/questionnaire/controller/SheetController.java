package com.cac.schedule.questionnaire.controller;


import com.cac.schedule.questionnaire.bean.SheetInfo;
import com.cac.schedule.questionnaire.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SheetController {

    @Autowired
    SheetService sheetService;

    @GetMapping("allSheets")
    public List<SheetInfo> getAllSheet(){
        return  sheetService.getSheetInfoListAll();
    }

    @PostMapping("addSheet")
    public String addSheet(SheetInfo sheetInfo){
        if(sheetInfo != null) {
            sheetService.addSheet(sheetInfo);
            return "success";
        }
        else
            return "false";
    }
}
