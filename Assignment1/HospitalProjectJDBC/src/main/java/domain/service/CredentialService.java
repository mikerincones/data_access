package domain.service;

import dao.repositories.CredentialRepository;
import domain.model.CredentialDTO;

public class CredentialService {
    private final CredentialRepository credentialRepository;


    public CredentialService(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    public CredentialDTO login(String username, String password) {
        CredenditalDTO credenditalDTO = credentialRepository.login(username);

    }
}
