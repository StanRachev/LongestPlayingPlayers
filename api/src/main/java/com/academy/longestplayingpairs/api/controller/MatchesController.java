package com.academy.longestplayingpairs.api.controller;

import com.academy.longestplayingpairs.api.repository.MatchesRepository;
import com.academy.longestplayingpairs.api.service.MatchesCSVService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/matches")
public class MatchesController {

    private final MatchesRepository matchesRepository;
    private final MatchesCSVService matchesCSVService;

    public MatchesController(MatchesRepository matchesRepository, MatchesCSVService matchesCSVService) {
        this.matchesRepository = matchesRepository;
        this.matchesCSVService = matchesCSVService;
    }

    @GetMapping("/selectDateFormat")
    public String showDateFormat() {
        return "selectDateFormat";
    }
}
