package com.tanmoy.client;

public record ClientService (){
    public void registerClient(ClientRegistrasionRequest request){
        Client client = Client.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email()).build();

        //validation korte hobe

    }
}
