package com.sequence.alticcisequence.controller;

import com.sequence.alticcisequence.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class SequenceController {

    @Autowired
    SequenceService sequenceService;


    @GetMapping("/alticci/{n}")
    ResponseEntity<Integer> resolveSequence(@PathVariable Integer n ){
        return ResponseEntity.ok(sequenceService.resolveSequence(n));
    }
}
