package com.NTTData.controller;

import com.NTTData.model.RequestGestorDTO;
import com.NTTData.service.NTTDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class NTTDataController {

    @Autowired
    private NTTDataService nttDataService;

    @PostMapping("/buscar")
    public ResponseEntity<?> procesarAdn(@RequestBody RequestGestorDTO requestGestorDTO){
        try {
            return new ResponseEntity<>(
                    nttDataService.getGestorByName(requestGestorDTO),
                    HttpStatus.OK);
        } catch (Exception e) {
            printError(e);
            return errorResponse();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getGraphString(){
        try {
            return new ResponseEntity<>(
                    nttDataService.getAllGestor(),
                    HttpStatus.OK);
        } catch (Exception e) {
            printError(e);
            return errorResponse();
        }
    }

    private ResponseEntity<String> errorResponse(){
        return new ResponseEntity<>("Se ha producido un error.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private void printError (Exception e){
        System.out.println("*********************************************");
        System.out.println("EROR:: ");
        StackTraceElement[] stackTraces = e.getStackTrace();
        for (StackTraceElement stackTrace: stackTraces) {
            System.out.println(stackTrace);
        }
    }
}
