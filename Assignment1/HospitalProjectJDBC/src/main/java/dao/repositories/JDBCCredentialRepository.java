package dao.repositories;

import domain.model.CredentialDTO;

public class JDBCCredentialRepository implements CredentialRepository{

    @Override
    public CredentialDTO login(String username) {
        return new CredentialDTO("galachox","2DAM");
    }
}
