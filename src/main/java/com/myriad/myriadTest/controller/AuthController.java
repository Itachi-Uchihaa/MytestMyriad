package com.myriad.myriadTest.controller;

import com.myriad.myriadTest.dto.UserDTO;
import com.myriad.myriadTest.model.User;
import com.myriad.myriadTest.repositorie.UserRepository;
import com.myriad.myriadTest.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public AuthController(AuthService authService, UserRepository userRepository) {
        this.authService = authService;
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserDTO userDTO) {
        LocalDate currentDate = LocalDate.now();
        LocalDate adult = currentDate.minusYears(18);

        LocalDate userBirthdate = userDTO.getBirthdate();
        String userCountry = userDTO.getCountryofresidence();

        if (userBirthdate != null && userBirthdate.isBefore(adult) && "France".equalsIgnoreCase(userCountry)) {
            // L'utilisateur est majeur et réside en France, poursuivez avec l'inscription
            User user = authService.register(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } else {
            // L'utilisateur ne remplit pas les critères requis, renvoyez une réponse d'erreur
            return ResponseEntity.badRequest().body("Only adults (18 years or older) and French residents are allowed to register.");
        }
    }


}
