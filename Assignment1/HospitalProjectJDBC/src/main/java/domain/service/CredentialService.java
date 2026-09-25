package domain.service;

import dao.repositories.CredentialRepository;
import domain.model.CredentialDTO;
import jakarta.inject.Inject;

public class CredentialService {
    private final CredentialRepository credentialRepository;

@Inject
    public CredentialService(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    public boolean login(String username, String password) {
        CredentialDTO credentialDTO = credentialRepository.login(username);
        if (credentialDTO.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
