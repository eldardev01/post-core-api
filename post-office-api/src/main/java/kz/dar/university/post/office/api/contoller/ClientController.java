package kz.dar.university.post.office.api.contoller;

import kz.dar.university.post.office.api.domain.ClientDTO;
import kz.dar.university.post.office.api.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }
    @GetMapping("/{clientId}")
    public ClientDTO getClientById(@PathVariable String clientId) {
        return clientService.getClientById(clientId);
    }

    @GetMapping("/list")
    List<ClientDTO> getEmployeesByList(@RequestParam List<String> clientsByIds)
    {
        return clientService.getClientByList(clientsByIds);
    };
}