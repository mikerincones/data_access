package domain.service;

import dao.repositories.CredentialRepository;

public class CredentialService {
    private final CredentialRepository credentialRepository;


    public CredentialService(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }
}
