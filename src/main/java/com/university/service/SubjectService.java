package com.university.service;

import com.university.model.Subject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubjectService {

    public List<String> getSubjects() {
        return Arrays.asList(Subject.values()).stream().map(subject -> subject.toString())
                .collect(Collectors.toList());
    }
}
