package com.springmvc.web.service;

import com.springmvc.web.dto.ClubDto;
import com.springmvc.web.models.Club;
import java.util.List;

public interface ClubService {
    List<ClubDto> findAll();
    Club findById(Long id);
}
