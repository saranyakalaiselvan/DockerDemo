package com.crackit.validvsvalidateddemo.model;

import com.crackit.validvsvalidateddemo.model.interfaces.AdvanceValidation;
import com.crackit.validvsvalidateddemo.model.interfaces.FirstLevelValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@Entity
public class CrackIT {
    @Id
    @NotNull(groups = FirstLevelValidation.class, message = "Id is mandatory")
    private Long id;

    @NotNull(groups = FirstLevelValidation.class, message = "Name is mandatory")
    private String name;

    @NotBlank(groups = AdvanceValidation.class, message = "Playlist Name should be a valid name")
    private String playListName;

    @Min(value = 100, groups = AdvanceValidation.class, message = "Views should be greater than 100")
    private Integer views;

    @Transient
    private  Analytics analytics;
}
