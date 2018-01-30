package com.hungta.security.model;

/**
 * @author HUNGTA on 01/23/18 - 1:38 AM
 * @project restful-mybatis
 */
public class AuthenticationResponse {
    private String access_token;

    public AuthenticationResponse(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

}
