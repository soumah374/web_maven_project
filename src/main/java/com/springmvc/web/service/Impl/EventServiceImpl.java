package com.springmvc.web.service.Impl;

import com.springmvc.web.dto.EventDto;
import com.springmvc.web.models.Club;
import com.springmvc.web.models.Event;
import com.springmvc.web.repository.ClubRepository;
import com.springmvc.web.repository.EventRepository;
import com.springmvc.web.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    EventRepository eventRepository;
    ClubRepository clubRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void createEvent(Long clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEventDto(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }

    public Event mapToEventDto(EventDto eventDto){
        Event event = Event
                .builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();
        return event;
    }
}
