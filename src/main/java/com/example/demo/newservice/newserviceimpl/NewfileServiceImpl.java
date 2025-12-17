import com.example.demo.newservice.NewfileServiceImpl;
package com.example.demo.newservice.newserviceimpl;

import com.example.demo.newentity.NewFileEntity;
import java.util.*;

public class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo repo;
    @Override
    public NewfileServiceImpl(NewfileRepo repo){
        this.repo = repo;
    }

    public NewFileEntity savedata(NewFileEntity st){
        return repo.save(st);
    }

    @Override
    public NewFileEntity getidval(Long id){
        return findById(id);
    }

    @Override
    public List<NewFileEntity> getalldata(){
        return findAll();
    }

    @Override
    public NewFileEntity update(Long id,NewFileEntity st){
        NewFileEntity exist = repo.findById(id).orElse(null);

        if(exist!=null){
            exist.setName(st.getName());
            exist.setEmail(st.getEmail());
            return repo.save(exist);
        }
        return null;
    }

    @Override
    public void del(Long id){
        repo.deleteById(id);
    }
}