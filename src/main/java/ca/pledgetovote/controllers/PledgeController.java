package ca.pledgetovote.controllers;

import ca.pledgetovote.model.Pledge;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PledgeController {
    private List<Pledge> pledges = new ArrayList<>();
    private AtomicLong  nextId = new AtomicLong();

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello Springers";
    }

    @PostMapping("/pledges")
    public Pledge createNewPledge(@RequestBody Pledge pledge){
        //set pledge to have next id
        pledge.setId(nextId.incrementAndGet());
        pledges.add(pledge);
    return pledge;
    }

    @GetMapping("/pledges")
    public List<Pledge> getAllPledges(){
     return pledges;
    }

    @GetMapping("/pledges/{id}")
    public Pledge getOnePledge(@PathVariable("id") long pledgeId) {
        for (Pledge pledge : pledges) {
            if (pledge.getId() == pledgeId) {
                return pledge;
            }
        }

        throw new IllegalArgumentException();
    }



}