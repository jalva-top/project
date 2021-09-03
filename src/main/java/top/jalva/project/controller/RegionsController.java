package top.jalva.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.jalva.project.domain.Region;
import top.jalva.project.enums.RegionId;
import top.jalva.project.repo.RegionsRepo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController("/regions")
@RequiredArgsConstructor
public class RegionsController {

    RegionsRepo repo;

    @GetMapping("/")
    public ResponseEntity<List<RegionId>> getRegionsIds() {
        List<RegionId> regions = Arrays.stream(RegionId.values()).collect(Collectors.toList());
        return new ResponseEntity<>(regions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable String id) {
        return new ResponseEntity<>(repo.findById(id).orElseThrow(), HttpStatus.OK);
    }
}
