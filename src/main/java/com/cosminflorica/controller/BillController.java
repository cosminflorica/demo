package com.cosminflorica.controller;

import com.cosminflorica.entity.Bill;
import com.cosminflorica.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/bill/")
public class BillController {
    @Autowired
    private BillRepository repository;

    @PostMapping("/addBill")
    public String saveBill(@RequestBody Bill bill){
        repository.save(bill);
        return "test123";
    }

    @GetMapping("/findAllBills")
    public List<Bill> getBills(){
        return repository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Bill> getBill(@PathVariable Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("deleteById/{id}")
    public String deleteBill(@PathVariable Integer id){
        repository.deleteById(id);
        return "bill deleted";
    }
}
