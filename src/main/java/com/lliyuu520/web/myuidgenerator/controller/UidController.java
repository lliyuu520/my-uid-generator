package com.lliyuu520.web.myuidgenerator.controller;

import com.lliyuu520.web.myuidgenerator.generator.UidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lliyuu520
 */
@RestController
@RequestMapping("/uid")
public class UidController {
    @Autowired
    private UidGenerator uidGenerator;

    @GetMapping("")
    public Map getUid() {
        long uid = uidGenerator.getUID();
        Map<String, String> map = new HashMap<>(1);
        map.put("UID", uid + "");
        return map;

    }
}
