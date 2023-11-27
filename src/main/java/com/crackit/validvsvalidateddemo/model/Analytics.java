package com.crackit.validvsvalidateddemo.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Analytics {

    @NotNull(message = "Analytics Name shouldn't be empty")
    private String analyticsName;
}
