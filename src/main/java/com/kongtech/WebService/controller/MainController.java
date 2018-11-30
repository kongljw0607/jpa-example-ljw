package com.kongtech.WebService.controller;

import com.kongtech.WebService.entitiy.Archive;
import com.kongtech.WebService.repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    ArchiveRepository archiveRepository;

    @GetMapping("/")
    public ResponseEntity<List<Archive>> getArchiveList () throws Exception{
        List<Archive> archiveList = archiveRepository.findAll();
        return new ResponseEntity<List<Archive>>(archiveList, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> insertArchive (
            @RequestBody Archive archive ) throws Exception{
        archive.setCreatedAt(new Date());
        archive.setUpdatedAt(new Date());
        archiveRepository.save(archive);
        return new ResponseEntity<String>("OK",HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> updateArchive(
            @RequestBody Archive archive,
            @PathVariable Long id) throws Exception{
        archive.setId(id);
        archive.setUpdatedAt(new Date());
        archiveRepository.save(archive);
        return new ResponseEntity<String>("OK",HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteArchive(
            @PathVariable Long id) throws  Exception{
        Archive archive = archiveRepository.getOne(id);
        archiveRepository.delete(archive);
        return new ResponseEntity<String>("OK",HttpStatus.OK);
    }
}
