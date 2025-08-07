package cliente.service;
import cliente.model.Cliente;
import cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente atualizar(Long id, Cliente novo) {
        Cliente cliente = repository.findById(id).orElseThrow();
        cliente.setNome(novo.getNome());
        cliente.setEmail(novo.getEmail());
        return repository.save(cliente);
    }
}
