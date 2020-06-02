package com.blockTeam4Boys.universityApi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class DiplomaController {

    RestTemplate restTemplate;

    @GetMapping(path = "/diploma/{number}")
    @PreAuthorize("hasAnyAuthority('ROLE_uma_protection')")
    public ResponseEntity<String> getDiploma(@PathVariable String number) {
        return restTemplate.getForEntity("http://localhost:8888/diploma/" + number, String.class);
    }
}
