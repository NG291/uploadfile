package com.demoformdatabinding.service;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadFileService {
    public void uploadFile(MultipartFile file) throws IOException {
        String folderUpload ="C:\\Users\\dell\\Desktop\\Model4\\code\\demoFormDatabinding\\src\\main\\webapp\\uploadFile";
        String fileName = file.getOriginalFilename();
        FileCopyUtils.copy(file.getBytes(), new File(folderUpload + fileName));
    }
}
