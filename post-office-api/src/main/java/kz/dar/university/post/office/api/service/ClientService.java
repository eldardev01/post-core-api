package kz.dar.university.post.office.api.service;

import kz.dar.university.post.office.api.domain.ClientDTO;
import kz.dar.university.post.office.api.feign.ClientF;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private  final ClientF clientF;

    public List<ClientDTO> getAllClients() {

        return clientF.getAllClients();
    }

    public ClientDTO getClientById(String clientId){
        return clientF.getClientById(clientId);
    }

}
