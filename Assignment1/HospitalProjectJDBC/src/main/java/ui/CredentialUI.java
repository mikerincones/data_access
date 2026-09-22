package ui;

import domain.service.CredentialService;

public class CredentialUI {
    public final CredentialService credentialService;

    public CredentialUI(CredentialService credentialService) {
        this.credentialService = credentialService;
    }

    public boolean login (String username,String password) {return credentialService.login();}
}
