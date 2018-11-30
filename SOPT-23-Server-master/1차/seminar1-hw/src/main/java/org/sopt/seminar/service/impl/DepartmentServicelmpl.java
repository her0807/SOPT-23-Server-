package org.sopt.seminar.service.impl;


import org.sopt.seminar.service.builder.Department;
import org.sopt.seminar.service.builder.DepartmentBuilder;

public class DepartmentServicelmpl implements DepartmentService {

    @Override
    public Department getByDepartmentIdx (int getByDepartmentIdx){
        final DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        final Department department1 = departmentBuilder
                .build();
        return department1;
    }
}
