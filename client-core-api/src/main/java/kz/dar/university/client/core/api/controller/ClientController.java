package kz.dar.university.client.core.api.controller;

import kz.dar.university.client.core.api.model.ClientModel;
import kz.dar.university.client.core.api.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientModel clientModel) {
        clientService.createClient(clientModel);
        return new ResponseEntity<>("Succesfully create", HttpStatus.OK);
    }

    @GetMapping
    public List<ClientModel> getAllClients () {
        return clientService.getAllClients();
    }

    @GetMapping("{clientId}")
    public ClientModel getClientById(@PathVariable String clientId) {
        return clientService.getClientById(clientId);
    }

    @PutMapping("{clientId}")
    public ResponseEntity<String> updateClientById(@PathVariable String clientId, @RequestBody ClientModel clientModel) {
        clientService.updateClientById(clientId, clientModel);
        return new ResponseEntity<>("Succesfully update", HttpStatus.OK);
    }

    @DeleteMapping("{clientId}")
    public ResponseEntity<String> deleteClientById(@PathVariable String clientId) {
        clientService.deleteClientById(clientId);
        return new ResponseEntity<>("Succesfully delete", HttpStatus.OK);
    }
}
