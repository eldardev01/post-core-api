package kz.dar.university.client.core.api.service;

import kz.dar.university.client.core.api.model.ClientModel;

import java.util.List;

public interface ClientService {
    void createClient (ClientModel clientModel);
    List<ClientModel> getAllClients();
    ClientModel getClientById(String clientId);
    void updateClientById(String clientId, ClientModel clientModel);
    void deleteClientById(String clientId);
    List<ClientModel> getClientByList(List<String> clientsByIds);

}
