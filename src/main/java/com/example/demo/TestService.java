package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final RepositoryObject repositoryObject;

    public String createOb(ObjectItemDto objectItemDto) {
        Objectem objectem = new Objectem();
        objectem.setFirstName(objectItemDto.getFirstName());
        repositoryObject.save(objectem);
        return "Created";
    }


}
