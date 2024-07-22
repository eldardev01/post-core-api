package client.core.api.controller;

import client.core.api.model.ClientModel;
import client.core.api.service.ClientService;
import jakarta.validation.Valid;
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
    public ResponseEntity<String> createClient(@Valid @RequestBody ClientModel clientModel) {
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

    @GetMapping("/clientsList")
    public List<ClientModel> getEmployeesByList( @RequestParam List<String> clientsByIds) {
        return clientService.getClientByList(clientsByIds);
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
