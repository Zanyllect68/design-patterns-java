package com.chat_mediator;

public abstract class Usuario {

    protected final String nombre;
    protected final ChatMediator chat;

    public Usuario(String nombre, ChatMediator chat) {
        this.nombre = nombre;
        this.chat = chat;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void enviar(String mensaje);

    public abstract void recibir(String mensaje, String remitente);
}
