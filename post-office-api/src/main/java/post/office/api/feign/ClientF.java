package kz.dar.university.post.office.api.feign;

import kz.dar.university.post.office.api.domain.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "client-core-api")
public interface ClientF {

    @GetMapping("/client")
    List<ClientDTO> getAllClients();

    @GetMapping("/client/{clientId}")
    ClientDTO getClientById(@PathVariable String clientId);
    @GetMapping("/client/clientsList")
    List<ClientDTO> getClientByList(@RequestParam List<String> clientsByIds);

}
