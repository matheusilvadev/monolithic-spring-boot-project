package com.gprmono.gpr.controllers;


import com.gprmono.gpr.model.Menu;
import com.gprmono.gpr.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> listAll(){
        return menuService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> findById(@PathVariable Long id){
        Optional<Menu> menu = menuService.findById(id);
        return menu.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Menu create(@RequestBody Menu menu){
        return menuService.save(menu);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Menu> update(@PathVariable Long id, @RequestBody Menu menuUpdate){
        Optional<Menu> menuOptional = menuService.findById(id);
        if (menuOptional.isPresent()){
            Menu menu  = menuOptional.get();
            menu.setName(menuUpdate.getName());
            menu.setPrice(menuUpdate.getPrice());
            return ResponseEntity.ok(menuService.save(menu));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        menuService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
