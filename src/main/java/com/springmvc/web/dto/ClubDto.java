package com.springmvc.web.dto;

import com.springmvc.web.models.Event;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ClubDto {
    private long id;
    private String title;
    private String content;
    private String photoUrl;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<Event> events;
}
