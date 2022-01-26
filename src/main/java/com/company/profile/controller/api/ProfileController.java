package com.company.profile.controller.api;

import com.company.profile.dto.ProfileDTO;
import com.company.profile.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

@RestController("/api/v1")
@AllArgsConstructor
@Validated
public class ProfileController {
    private ProfileService profileService;

    @GetMapping("profile/{id}")
    public ProfileDTO getProfileById(@PathVariable("id") @Min(value = 1, message = "profile id cant be less then 1") Integer id) {
        return profileService.findById(id);
    }
}
