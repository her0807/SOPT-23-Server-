package org.sopt.seminar.service.impl;

import org.sopt.seminar.service.builder.University;
import org.sopt.seminar.service.builder.UniversityBuilder;

public class UniversityServicelmpl implements UniversityService {

    @Override
    public University getByUniversityIdx(int getByUniversityIdx){
        UniversityBuilder universityBuilder1 = new UniversityBuilder();
        University university1 =universityBuilder1
                .build();
        return university1;
    }
}
