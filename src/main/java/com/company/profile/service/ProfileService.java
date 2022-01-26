package com.company.profile.service;

import com.company.profile.converter.ProfileConverter;
import com.company.profile.dto.ProfileDTO;
import com.company.profile.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {
    private final ProfileRepository profileRepository;
    private final ProfileConverter profileConverter;

    public ProfileDTO findById(Integer id) {
        return profileConverter.toDTO(profileRepository.findById(id).orElseThrow());
    }
}