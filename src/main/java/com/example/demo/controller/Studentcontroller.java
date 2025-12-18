package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservices;

@RestController
@RequestMapping("/api/students")
public class Studentcontroller {

    private final Studentservices src;

   
    public Studentcontroller(Studentservices src) {
        this.src = src;
    }

    @PostMapping("/post")
    public Studententity insertData(@RequestBody Studententity st) {
        return src.postdata(st);
    }

    @GetMapping("/get")
    public List<Studententity> wantData() {
        return src.getdata();
    }

    @GetMapping("/getid/{id}")
    public Studententity particularData(@PathVariable Long id) {
        return src.getIdValue(id);
    }

    @PutMapping("/{id}")
    public Studententity updateData(@PathVariable Long id,
                                    @RequestBody Studententity st) {
        return src.update(id, st);
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable Long id) {
    src.delete(id);   

}
}