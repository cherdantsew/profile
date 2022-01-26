package com.company.profile.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class ProfileDTO {
    private Integer id;
    private Long gold;
    private Integer winCount;
    private Integer fightsCount;
}
