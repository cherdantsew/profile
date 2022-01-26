package com.company.profile.repository;

import com.company.profile.entity.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Integer> {
}