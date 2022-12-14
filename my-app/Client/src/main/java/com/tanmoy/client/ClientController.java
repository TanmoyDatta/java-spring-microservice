package com.tanmoy.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("api/v1/clients")
public record ClientController(ClientService clientService) {
    @PostMapping
    public void registerClient(@RequestBody ClientRegistrasionRequest clientRegistrasionRequest){
        log.info("new client registration {} ",clientRegistrasionRequest);
    }
}
