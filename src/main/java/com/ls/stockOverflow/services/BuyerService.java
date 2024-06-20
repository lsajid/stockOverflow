package com.ls.stockOverflow.services;

import com.ls.stockOverflow.models.Buyer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuyerService {
    List<Buyer> buyers = new ArrayList<>(
            Arrays.asList(
                    new Buyer("password", "test", "test", 1),
                    new Buyer("password1", "test1", "test1", 2),
                    new Buyer("password2", "test2", "test2", 3),
                    new Buyer("password3", "test3", "test3", 4)
            )
    );

    public List<Buyer> retrieveAll() {
        return buyers;
    }

    public Buyer retrieveOne(int id) {
        return buyers.get(id-1);
    }

    public Buyer createOne(Buyer buyer) {
        buyers.add(buyer);
        return buyer;
    }

    public void updateOne(int id, Buyer buyer) {
        for(int i=0; i<buyers.size(); i++) {
            Buyer currentBuyer = buyers.get(i);
            if(currentBuyer.getId() == id) {
                buyers.set(i, buyer);
                return;
            }
        }
        System.out.println("Buyer not found");
    }

    public void removeOne(int id) {
        for(int i=0; i<buyers.size(); i++) {
            if(buyers.get(i).getId() == id) {
                buyers.remove(buyers.get(i));
                return;
            }
        }
        System.out.println("Buyer not found");
    }
}

