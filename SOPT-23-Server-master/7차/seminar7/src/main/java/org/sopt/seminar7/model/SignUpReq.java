package org.sopt.seminar7.model;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class SignUpReq {
    private  String email;
    private String password;




    private MultipartFile profile;
    //프로필 사진 저장 url 주소
    private String profileUrl;
}
