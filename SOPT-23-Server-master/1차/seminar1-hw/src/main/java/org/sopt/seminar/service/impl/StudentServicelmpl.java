package org.sopt.seminar.service.impl;

import org.sopt.seminar.service.builder.Student;
import org.sopt.seminar.service.builder.StudentBuilder;

public class StudentServicelmpl implements StudentService {

    @Override
    public Student getByStudentIdx(int getByStudentIdx) {
        final StudentBuilder studentBuilder1 = new StudentBuilder();
        final Student student1 = studentBuilder1
                .build();
        return student1;

    }
}