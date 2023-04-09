package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.example.demo.Utils.ConstantsUtils.IMAGE_PATH;

@Service
public class ImageService {


    public void uploadImage(MultipartFile image, String imageName) {
        String fullPath = new File(IMAGE_PATH.replace("${IMAGE_NAME}", imageName)).getAbsolutePath();

        System.out.println(fullPath);
        try {
            image.transferTo(new File(fullPath));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public byte[] downloadImage(String imageName) {
        String fullPath = IMAGE_PATH.replace("${IMAGE_NAME}", imageName);
        try {
            return Files.readAllBytes(new File(fullPath).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
