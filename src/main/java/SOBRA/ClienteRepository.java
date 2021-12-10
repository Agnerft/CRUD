///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package br.com.fcompany.ws;
//
//import br.com.fcompany.rn.Cliente;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//
//public class ClienteRepository {
//
//    private Connection connection;
//    private PreparedStatement pdst;
//    private ResultSet rs;
//    private int contadorId;
//
//    //PARA ABRIR A CONEXÃO COM O BANCO
//    public void openConnection() throws SQLException {
//        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cliente", "postgres", "postgres");
//    }
//    
//    //PARA INSERIR CLIENTE
//    public void insereCliente(Cliente cliente) throws SQLException {
//        openConnection();
//        System.out.println("Executando um insert");
//        try {
//            // QUANDO COLOCO RETURNING id quando la no banco eu coloco na variavel id o SERIAL --> Usa-se SERIAL, para criar objetos na sequencia;
//            String insereCliente = "INSERT INTO tabela_cliente (nome, numeroTelefone, cpf, email) VALUES(?,?,?,?) RETURNING id";
//            //prepareStatement colocamos porque ele é uma instrução SQL pré-pronta, ELE PEGA O OBJETO Armazena e pre-compila
//            // A instução passada em parenteses tanto pode ser a queryselect direto ou uma string escrita antes;
//            pdst = connection.prepareStatement(insereCliente);
//            //ELE é um metodo especifico para utilizar na interface java.SQL.prepareStatement
//            //.SetObjetc primerio paramentro é o primeiro VALUE passado na String e o segundo paramentro é da onde eu vou pegar o parametro;
//            //.SetInt o objeto que eu vou trazer de parametro tem que ser int
//            pdst.setObject(1, cliente.getNome());
//            pdst.setObject(2, cliente.getNumeroTelefone());
//            pdst.setObject(3, cliente.getCpf());
//            pdst.setObject(4, cliente.getEmail());
//            // Que o que acontecer no PreparedStatement.executeQuery() sera pasado para o ResulSet
//            rs = pdst.executeQuery();
//
//        } finally {
//            connection.close();
//        }
//    }
//
//    //PARA SELECIONAR CLIENTE
//    public Cliente selectCliente(int idcliente, Cliente cliente) throws SQLException {
//        openConnection();
//        System.out.println("Executando um select");
//        try {
//            String selectCliente = "SELECT * FROM tabela_cliente where id = ?";
//            pdst = connection.prepareStatement(selectCliente);
//            pdst.setObject(1, idcliente);
//            rs = pdst.executeQuery();
//            // ResultSet.next() é para consultas no banco ( função SELECT ) --> ele pega as INFOS passadas na String e
//            // faz as respectivas ações
//            //.next() faz uma solicitação para o banco
//            if (rs.next()) {
//                cliente.setNome(rs.getString("nome")); // <-- valor que FOI setado na variavel descrita para o banco dentro do getString();
//                cliente.setNumeroTelefone(rs.getInt("numeroTelefone"));
//                cliente.setCpf(rs.getString("cpf"));
//                cliente.setEmail(rs.getString("email"));
//                cliente.setId(idcliente);
//
//                System.out.println(cliente);
//            }
//
//        } finally {
//            closeConnection();
//        }
//        return cliente;
//    }
//
//    //PARA DELETAR CLIENTE
//    public void deleteCliente(int idcliente) throws SQLException {
//        openConnection();
//        System.out.println("Executando um delete");
//        try {
//            String deleteCliente = "delete from tabela_cliente where id = ?";
//            pdst = connection.prepareStatement(deleteCliente);
//
//            pdst.setInt(1, idcliente);
//
//            pdst.execute();
//            System.out.println("passou por aqui");
//
//        } finally {
//            closeConnection();
//        }
//
//    }
//
//    //PARA ATUALIZAR CLIENTE
//    public int updateCliente(int idcliente, Cliente cliente) throws SQLException {
//        openConnection();
//
//        try {
//            String updateCliente = "update tabela_cliente set nome=?, numeroTelefone=?, cpf=?, email=? where id = ?";
//            pdst = connection.prepareStatement(updateCliente);
//
//            pdst.setInt(5, idcliente);
//            pdst.setString(1, cliente.getNome());
//            pdst.setInt(2, cliente.getNumeroTelefone());
//            pdst.setString(3, cliente.getCpf());
//            pdst.setString(4, cliente.getEmail());
//            pdst.execute();
//            if (cliente.getCpf() == null) {
//                System.out.println("Deu certo");
//            }
//
//        } finally {
//            closeConnection();
//        }
//
//        return 0;
//
//    }
//
//    //PARA CONTAR OS REGISTROS
//    public int selecId() throws SQLException {
//        openConnection();
//        int soma = 0;
//        try {
//            String selectId = "select id From tabela_cliente";
//            pdst = connection.prepareStatement(selectId);
//            rs = pdst.executeQuery();
//
//            while (rs.next()) {
//                ++soma;
//            }
//        } finally {
//
//            closeConnection();
//        }
//        return soma;
//    }
//
//    //PARA FECHAR A CONEXÃO COM O BANCO
//    public void closeConnection() throws SQLException {
//        connection.close();
//    }
//
//    public int getContadorId() {
//        return contadorId;
//    }
//
//}
