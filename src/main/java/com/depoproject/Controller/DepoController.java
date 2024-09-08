package com.depoproject.Controller;

import com.depoproject.Entity.Depo;
import com.depoproject.Service.DepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/depo")
public class DepoController {
    @Autowired
    private DepoService depoService;

    @PostMapping("/add")
    public ResponseEntity<Depo> saveDepo(@RequestBody Depo depo){
        Depo savedDepo = depoService.saveDepo(depo);
        return ResponseEntity.ok(savedDepo);
    }
}
