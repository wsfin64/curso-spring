package wsfin64.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wsfin64.model.Cliente;
import wsfin64.repository.ClientesRespository;

@Service
public class ClientesService {

    ClientesRespository respository;

    @Autowired
    public ClientesService(ClientesRespository respository){
        this.respository = respository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.respository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        // aplica validações
    }

}
