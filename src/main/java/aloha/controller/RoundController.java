package aloha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aloha.entity.RoundEntity;
import aloha.entity.TournamentEntity;
import aloha.service.IRoundService;
import aloha.service.ITournament;

@RestController

public class RoundController {

		@Autowired
		private IRoundService RoundService;
//        @CrossOrigin(origins = "http://127.0.0.1:5555")
        @GetMapping(value="/find-round")
        public List<RoundEntity> getAll(@RequestParam int id) {
        		List<RoundEntity> a = RoundService.findAllWhereStatus1(id);
                return a;
                
        }
        @PostMapping(value="/find-one")
        public RoundEntity getOne() {
        		RoundEntity a = RoundService.findById(1);
                return a;
                
        }
        

}