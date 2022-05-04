package azat.curs.curs.services;


import azat.curs.curs.models.Client;
import azat.curs.curs.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void saveClient(Client client) {
        clientRepository.save(client);

    }

    public List<Client> listAllClients() {
        return clientRepository.findAll();
    }

    public Client getById(Integer id) {
        return  clientRepository.findById(id).get();
    }

    public void delete(Integer id) {
        clientRepository.deleteById(id);

    }
}
