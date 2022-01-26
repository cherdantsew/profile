package com.company.profile.converter;

import com.company.profile.dto.ProfileDTO;
import com.company.profile.entity.Profile;
import org.springframework.stereotype.Component;

@Component
public class ProfileConverter {
    public ProfileDTO toDTO(Profile profile) {
        return ProfileDTO.builder()
                .id(profile.getId())
                .gold(profile.getGold())
                .winCount(profile.getWinCount())
                .fightsCount(profile.getFightsCount())
                .build();
    }
}
