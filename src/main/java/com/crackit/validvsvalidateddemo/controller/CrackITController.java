package com.crackit.validvsvalidateddemo.controller;


import com.crackit.validvsvalidateddemo.model.CrackIT;
import com.crackit.validvsvalidateddemo.model.interfaces.AdvanceValidation;
import com.crackit.validvsvalidateddemo.model.interfaces.FirstLevelValidation;
import com.crackit.validvsvalidateddemo.service.CrackITService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Validated
@RequestMapping("/v1/annotations/demo")
public class CrackITController {

    @Autowired
    private CrackITService crackITService;

    @PostMapping("/crackIT")
    public CrackIT createCrackIT(@Valid @RequestBody CrackIT crackIT) {
        return crackITService.createCrackIT(crackIT);
    }

    @PostMapping("/crackIT/step1")
    public CrackIT createCrackITValidatedExample(@Validated(AdvanceValidation.class)
                                                     @RequestBody CrackIT crackIT) {
        return crackITService.createCrackIT(crackIT);
    }

}
