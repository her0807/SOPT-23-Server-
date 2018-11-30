package org.sopt.seminar.service.impl;

import org.sopt.seminar.service.builder.Professor;

public interface ProfessorService {
    Professor getByProfessorIdx(final int idx);
}
