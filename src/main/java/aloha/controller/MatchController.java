package aloha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aloha.entity.MatchEntity;
import aloha.entity.RoundEntity;
import aloha.service.IMatchService;
import aloha.service.IRoundService;

@RestController

public class MatchController {

	@Autowired
	private IMatchService MatchService;
//    @CrossOrigin(origins = "http://127.0.0.1:5555")
    @PostMapping(value="/add-match")
    public String getAll(@RequestBody MatchEntity entity) {
    	String msg = MatchService.addMatch(entity);
    	return msg;
            
    }
}
