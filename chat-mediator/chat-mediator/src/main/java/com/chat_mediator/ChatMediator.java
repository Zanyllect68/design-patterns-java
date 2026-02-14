package com.chat_mediator;

public interface ChatMediator {
    void registrarUsuario(Usuario usuario);
    void enviarMensaje(String mensaje, Usuario remitente);
}
