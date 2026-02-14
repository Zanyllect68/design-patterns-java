package com.chat_mediator;

public class Main {

    public static void main(String[] args) {
        ChatMediator sala = new ChatRoom();

        Usuario andres = new UsuarioConcreto("Andrés", sala);
        Usuario maria = new UsuarioConcreto("María", sala);
        Usuario juan = new UsuarioConcreto("Juan", sala);

        sala.registrarUsuario(andres);
        sala.registrarUsuario(maria);
        sala.registrarUsuario(juan);

        andres.enviar("Hola a todos!");
        maria.enviar("Hola Andrés, ¿cómo estás?");
    }
}
