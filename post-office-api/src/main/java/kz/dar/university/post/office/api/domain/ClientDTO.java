package kz.dar.university.post.office.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDTO {
    private String clientId;
    private String clientEmail;
    private String clientName;
    private String clientSurname;
}
