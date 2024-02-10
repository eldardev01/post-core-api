package kz.dar.university.post.office.api.contoller;

import kz.dar.university.post.office.api.domain.ClientResponse;
import kz.dar.university.post.office.api.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/office/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<ClientResponse> getAllClients() {
        return clientService.getAllClients();
    }

    public ClientResponse getClientById(@PathVariable String clientId) {
        return clientService.getClientById(clientId);
    }
}
