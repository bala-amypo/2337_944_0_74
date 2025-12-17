package com.example.demo.newservice.newserviceimpl;
import java.util.List;
import org. springframework.stereotype.Service;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;
@Service
public class NewfileServiceImpl implements NewfileService{
@Override
public NewfileEntity savedata(NewfileEntity newfile) {

@Override
public NewfileEntity getidval(Long id) {

}

@Override
public List<NewfileEntity> getall() {
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

    }

    @Override
    public void del(Long id){

    }
}
@Override
public NewfileEntity update(Long id, NewfileEntity newfile) {

@Override
public void delete(Long id) {