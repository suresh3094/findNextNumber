package com.example.demo.service;

import com.example.demo.constants.MessageCodes;
import com.example.demo.entity.Number;
import com.example.demo.io.BaseResponse;
import com.example.demo.io.StatusMessage;
import com.example.demo.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
   @Autowired
    SearchRepository searchRepository;

    public BaseResponse search(int CategoryCode){
        int Fetch_CategoryCode=searchRepository.findByCategoryId(1);
        Number number=new Number();
        int c=0;
        int CategoryCodeNew=CategoryCode;
        while (CategoryCode>0||c>9)
        {
            if(CategoryCode==0)
            {
                CategoryCode=c;
                c=0;
            }
            c+=CategoryCode%10;
            CategoryCode/=10;
        }
        if(CategoryCodeNew>Fetch_CategoryCode && c==1)
        {
            number.setCategoryId(1);
number.setCategoryCode(CategoryCodeNew);
searchRepository.save(number);

        }


        return BaseResponse.builder()
                .status(MessageCodes.SUCCESS)
                .statusMessage(StatusMessage.builder()
                        .code(MessageCodes.SUCCESS)
                        .description(MessageCodes.SUCCESS_DESC)
                        .build())
                .data(number)
                .build();
    }
}
