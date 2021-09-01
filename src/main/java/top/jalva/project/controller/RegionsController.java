package top.jalva.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.jalva.project.enums.Region;
import top.jalva.project.domain.Regions;
import top.jalva.project.repo.RegionsRepo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RegionsController {

    RegionsRepo repo;

    @Autowired
    public RegionsController(RegionsRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/regions")
     ResponseEntity<List<Region>> regions() {
        List<Region> regions = Arrays.asList(Region.values()).stream().collect(Collectors.toList());
        return new ResponseEntity(regions, HttpStatus.OK);
    }

    @GetMapping("/regions/{id}")
    ResponseEntity<Regions> region(@PathVariable String id) {
        return new ResponseEntity(repo.findById(id), HttpStatus.OK);
    }
}
