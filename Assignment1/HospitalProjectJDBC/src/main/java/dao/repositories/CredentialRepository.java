package dao.repositories;

import domain.model.CredentialDTO;

public interface CredentialRepository {
    CredentialDTO login(String username);
}
