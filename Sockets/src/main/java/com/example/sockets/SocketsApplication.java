package com.example.sockets;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketsApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SocketsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ServerSocket socket = new ServerSocket();
	}
}
