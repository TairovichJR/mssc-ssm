package guru.springframework.msscssm.domain;

public enum PaymentState {
    NEW, PRE_AUTH, PRE_AUTH_ERROR, AUTH, AUTH_ERROR
    // flows:
    // positive: new -> pre-auth -> auth
    // negative: pre-auth -> pre-auth-error
    // negative: auth -> auth-error
}
