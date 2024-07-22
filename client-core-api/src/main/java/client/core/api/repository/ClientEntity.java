package kz.dar.university.client.core.api.repository;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String clientId;
    @Column(nullable = false, length = 50)
    private String clientEmail;
    @Column(nullable = false, length = 50)
    private String clientName;
    @Column(nullable = false, length = 50)
    private String clientSurname;

}
