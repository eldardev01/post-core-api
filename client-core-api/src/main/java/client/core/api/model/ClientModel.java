package kz.dar.university.client.core.api.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {
    private String clientId;
    @Email
    private String clientEmail;
    @NotNull(message = "Name can not be empty")
    private String clientName;
    private String clientSurname;
}
