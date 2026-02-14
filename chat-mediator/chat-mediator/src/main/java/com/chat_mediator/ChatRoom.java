package com.chat_mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        for (Usuario usuario : usuarios) {
            if (usuario != remitente) {
                usuario.recibir(mensaje, remitente.getNombre());
            }
        }
    }
}
