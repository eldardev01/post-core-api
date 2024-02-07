package kz.dar.university.client.core.api.service;

import kz.dar.university.client.core.api.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {
    private static final HashMap<String, ClientModel> clientMap = new HashMap<>();

    static {
        ClientModel clientModel1 = new ClientModel(
                UUID.randomUUID().toString(),
                "lebron@gmail.com",
                "James",
                "Lebron");
        ClientModel clientModel2 = new ClientModel(
                UUID.randomUUID().toString(),
                "ivan123@gmail.com",
                "Ivan",
                "Petrov");
    }

    @Override
    public void createClient(ClientModel clientModel) {
        clientMap.put(UUID.randomUUID().toString(),clientModel);
    }

    @Override
    public List<ClientModel> getAllClients() {
        return new ArrayList<>(clientMap.values());
    }

    @Override
    public ClientModel getClientById(String clientId) {
        return clientMap.get(clientId);
    }

    @Override
    public void updateClientById(String clientId, ClientModel clientModel) {
        if (clientMap.containsKey(clientId)) {
            clientModel.setClientId(clientId);
            clientMap.put(clientId,clientModel);
        }
    }

    @Override
    public void deleteClientById(String clientId) {
        clientMap.remove(clientId);
    }
}
