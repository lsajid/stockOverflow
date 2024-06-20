package com.ls.stockOverflow.controllers;

import com.ls.stockOverflow.models.ReviewBuyer;
import com.ls.stockOverflow.services.ReviewBuyerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ReviewBuyerController {
    ReviewBuyerService reviewBuyerService = new ReviewBuyerService();

    //Get all buyers
    //Request Type: GET
    //Route: /buyers
    //Provided Data: none
    //Returns an array of buyers via JSON
    @GetMapping("/buyersRev")
    public List<ReviewBuyer> getAll() {
        return reviewBuyerService.retrieveAll();
    }

    //Get one buyer
    //Request Type: GET
    //Route: /buyers
    //Provided Data: id via path parameter
    //Returns single object user via JSON
    @GetMapping("/buyersRev/{id}")
    public ReviewBuyer getOne(@PathVariable("id") int id) {
        return reviewBuyerService.retrieveOne(id);
    }


}
