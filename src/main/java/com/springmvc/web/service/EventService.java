package com.springmvc.web.service;

import com.springmvc.web.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

}
