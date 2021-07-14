package com.example.demo.controller;


import com.example.demo.io.BaseResponse;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class SearchController {
    @Autowired
    SearchService searchService;

    @PostMapping("/FetchNextNumber")
    public ResponseEntity<BaseResponse> search(@RequestParam int CategoryCode) throws Exception{
        BaseResponse baseResponse= searchService.search(CategoryCode);
        return ResponseEntity.ok(baseResponse);
    }
}
