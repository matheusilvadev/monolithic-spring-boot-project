package com.gprmono.gpr.services;


import com.gprmono.gpr.model.Menu;
import com.gprmono.gpr.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> listAll(){
        return menuRepository.findAll();
    }

    public Optional<Menu> findById(Long id){
        return menuRepository.findById(id);
    }

    public Menu save(Menu menu){
        return menuRepository.save(menu);
    }

    public void delete(Long id){
        menuRepository.deleteById(id);
    }
}
