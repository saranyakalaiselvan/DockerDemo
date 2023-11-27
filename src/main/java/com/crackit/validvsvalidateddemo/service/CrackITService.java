package com.crackit.validvsvalidateddemo.service;

import com.crackit.validvsvalidateddemo.model.CrackIT;
import com.crackit.validvsvalidateddemo.repository.CrackITRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrackITService {

    @Autowired
    private CrackITRepository crackITRepository;
    public CrackIT createCrackIT(CrackIT crackIT) {
        return crackITRepository.save(crackIT);
    }
}
