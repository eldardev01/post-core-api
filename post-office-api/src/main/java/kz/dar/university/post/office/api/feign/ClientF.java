package kz.dar.university.post.office.api.feign;

import kz.dar.university.post.office.api.domain.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "client-core-api")
public interface ClientF {

    @GetMapping("/client")
    List<ClientResponse> getAllClients();

    @GetMapping("/client/{clientId}")
    ClientResponse getClientById(@PathVariable String clientId);

}
