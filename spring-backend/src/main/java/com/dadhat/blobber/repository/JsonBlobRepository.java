package com.dadhat.blobber.repository;

import com.dadhat.blobber.model.JsonBlob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JsonBlobRepository extends JpaRepository<JsonBlob, Long > {

}
