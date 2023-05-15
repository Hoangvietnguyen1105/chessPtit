package aloha.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aloha.entity.TournamentEntity;
import aloha.service.ITournament;

import java.util.List;
 


@RestController

public class TournamentController {

		@Autowired
		private ITournament TournamentService;
//        @CrossOrigin(origins = "http://127.0.0.1:5555")
        @GetMapping(value="/getAll")
        public List<TournamentEntity> getAll() {
        		List<TournamentEntity> a = TournamentService.getAll();
                return a;
                
        }
        

}