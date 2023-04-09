package com.example.demo.controller;

import com.example.demo.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("upload")
    public void uploadImage(@RequestParam("productImage") MultipartFile image, @RequestParam("imageName") String imageName){
        imageService.uploadImage(image, imageName);
    }

    @GetMapping("download")
    public ResponseEntity<byte[]> downloadImage(@RequestParam String imageName){
        byte[] image = imageService.downloadImage(imageName);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(image);
    }

}

