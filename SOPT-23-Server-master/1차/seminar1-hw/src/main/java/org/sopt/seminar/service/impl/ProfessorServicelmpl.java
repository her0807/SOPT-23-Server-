package org.sopt.seminar.service.impl;

import org.sopt.seminar.service.builder.Professor;
import org.sopt.seminar.service.builder.ProfessorBuilder;

public class ProfessorServicelmpl implements ProfessorService {

    @Override
    public Professor getByProfessorIdx(int getByProfessorIdx){
        final ProfessorBuilder professorBuilder1 = new ProfessorBuilder();
        final Professor professor1 =professorBuilder1
                .build();
        return professor1;

    }

}