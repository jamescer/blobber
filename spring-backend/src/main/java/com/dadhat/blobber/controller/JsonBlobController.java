package com.dadhat.blobber.controller;

import com.dadhat.blobber.model.JsonBlob;
import com.dadhat.blobber.service.JsonBlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/jsonblob")
public class JsonBlobController {

    @Autowired
    private JsonBlobService jsonBlobService;

    @GetMapping("/all")
    public List<JsonBlob> getAllJsonBlobs(){
        return jsonBlobService.fetchJsonBlobList();
    }

    @GetMapping("/")
    public List<JsonBlob> getAll(){
        return jsonBlobService.fetchJsonBlobList();
    }

}
