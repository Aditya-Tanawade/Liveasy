package com.Liveasy.internship.controller;

import com.Liveasy.internship.entities.Load;
import com.Liveasy.internship.services.LoadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/load")
@RequiredArgsConstructor
public class LoadController {

    private final LoadService loadService;

    @PostMapping
    public ResponseEntity<Load> createLoad(@RequestBody Load load) {
        Load createdLoad = loadService.createLoad(load);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLoad);
    }

    @GetMapping
    public ResponseEntity<List<Load>> getLoads(@RequestParam Map<String, String> filters) {
        List<Load> loads = loadService.getLoads(filters);
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Load> getLoadById(@PathVariable Long loadId) {
        Load load = loadService.getLoadById(loadId);
        return ResponseEntity.ok(load);
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<Load> updateLoad(@PathVariable Long loadId, @RequestBody Load loadDetails) {
        Load updatedLoad = loadService.updateLoad(loadId, loadDetails);
        return ResponseEntity.ok(updatedLoad);
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<Void> deleteLoad(@PathVariable Long loadId) {
        loadService.deleteLoad(loadId);
        return ResponseEntity.noContent().build();
    }
}
