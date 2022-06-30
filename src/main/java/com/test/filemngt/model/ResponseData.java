package com.test.filemngt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {

    private  String fileName;
    private String downloadURL;
    private  String fileType;
    private long fileSize;
   }
