package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studententity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.Studentservices;

@Service
public class StudentserviceImpl implements Studentservices {

    private final StudentRepo rep;

    public StudentserviceImpl(StudentRepo rep) {
        this.rep = rep;
    }

    @Override
    public Studententity postdata(Studententity st) {
        return rep.save(st);
    }

    @Override
    public List<Studententity> getdata() {
        return rep.findAll();
    }

    @Override
    public Studententity getIdValue(Long id) {
        return rep.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public Studententity update(Long id, Studententity st) {
        Studententity existing = getIdValue(id);

        existing.setName(st.getName());
        existing.setEmail(st.getEmail());
        existing.setPassword(st.getPassword());
        existing.setRole(st.getRole());

        return rep.save(existing);
    }

    @Override
    public void delete(Long id) {
        rep.deleteById(id);
    }
}