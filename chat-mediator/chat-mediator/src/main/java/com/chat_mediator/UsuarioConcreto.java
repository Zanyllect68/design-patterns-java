package com.chat_mediator;

public class UsuarioConcreto extends Usuario {

    public UsuarioConcreto(String nombre, ChatMediator chat) {
        super(nombre, chat);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);
        chat.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje, String remitente) {
        System.out.println(nombre + " recibe de " + remitente + ": " + mensaje);
    }
}
