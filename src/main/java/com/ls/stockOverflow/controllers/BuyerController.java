package com.ls.stockOverflow.controllers;

import com.ls.stockOverflow.models.Buyer;
import com.ls.stockOverflow.services.BuyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("buyers")
public class BuyerController {
    BuyerService buyerService = new BuyerService();

    //Get all Buyers
    //Request Type: GET
    //Route: /buyers
    //Provided data: none
    //Returns array all users via JSON
    @GetMapping("")
    public List<Buyer> getAll(){
        return buyerService.retrieveAll();
    }

    //Get one Buyer
    //Request Type: GET
    //Route: /buyers/:id
    //Provided data: id via path parameter
    //Returns single object user via JSON
    @GetMapping("/{id}")
    public Buyer getOne(@PathVariable("id") int id){
        System.out.println("Id is written below ----");
        System.out.println(id);
        return buyerService.retrieveOne(id);
    }

    //Create one Buyer
    //Request Type: POST
    //Route: /buyers
    //Provided data: buyer data via body
    //Returns: created user object
    @PostMapping("")
    public Buyer postOne(@RequestBody Buyer buyer){
        return buyerService.createOne(buyer);
    }

    //Update one Buyer
    //Request Type: PUT
    //route: /buyers/:id
    //Provided data: id via path parameter
    //Returns: Status code
    @PutMapping("/{id}")
    public void putOne(@PathVariable("id") int id, @RequestBody Buyer buyer) {
        buyerService.updateOne(id, buyer);
    }

    //Delete one Buyer
    //Request Type: DELETE
    //route: /buyers/:id
    //Provided data: id via path parameter
    //Returns: Status code
    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable("id") int id) {
        buyerService.removeOne(id);
    }
}
