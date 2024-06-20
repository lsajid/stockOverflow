package com.ls.stockOverflow.services;

import com.ls.stockOverflow.models.ReviewBuyer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewBuyerService {
    List<ReviewBuyer> buyers = new ArrayList<>(
            Arrays.asList(
                    new ReviewBuyer("james", 10, true),
                    new ReviewBuyer("johnes", 10, true),
                    new ReviewBuyer("jacks", 10, true),
                    new ReviewBuyer("janes", 10, true)
                )
            );

    public List<ReviewBuyer> retrieveAll() {
        return buyers;
    }

    public ReviewBuyer retrieveOne(int id) {
        return buyers.get(id-1);
    }
}
