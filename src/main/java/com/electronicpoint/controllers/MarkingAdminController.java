package com.electronicpoint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronicpoint.domain.marking.Marking;
import com.electronicpoint.services.MarkingService;

@RestController()
@RequestMapping("/admin/markings")
public class MarkingAdminController {

    @Autowired
    MarkingService markingService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Marking>> getMarkingsByEmployee(@PathVariable("userId") Long userId) {

        List<Marking> markings = markingService.getMarkingsByEmployee(userId);
        return new ResponseEntity<>(markings, HttpStatus.OK);

    }

}
