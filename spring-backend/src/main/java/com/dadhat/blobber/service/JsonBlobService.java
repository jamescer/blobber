package com.dadhat.blobber.service;

import com.dadhat.blobber.model.JsonBlob;
import com.dadhat.blobber.repository.JsonBlobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonBlobService {

    @Autowired
    JsonBlobRepository jsonBlobRepository;

    /**
     * Get ALl JsonBlobs
     * @return
     */
    public List<JsonBlob> fetchJsonBlobList() {
        List<JsonBlob> all = jsonBlobRepository.findAll();
        return all;
    }

}
