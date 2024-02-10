package kz.dar.university.post.office.api.service;

import kz.dar.university.post.office.api.domain.ClientResponse;
import kz.dar.university.post.office.api.feign.ClientF;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private  final ClientF clientF;

    public List<ClientResponse> getAllClients() {
        return clientF.getAllClients();
    }

    public ClientResponse getClientById(String clientId){
        return clientF.getClientById(clientId);
    }

}
