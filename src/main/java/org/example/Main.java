package org.example;

import com.consulta.cep.BuscaEndereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite teu cep:");
        String cep = input.nextLine();
        BuscaEndereco busca= new BuscaEndereco();
        System.out.println(busca.buscar(cep));
    }
}