package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Studententity;

public interface Studentservices {

    Studententity postdata(Studententity st);

    List<Studententity> getdata();

    Studententity getIdValue(Long id);

    Studententity update(Long id, Studententity st);

    void delete(Long id);
}