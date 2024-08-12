package entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class gravarCSV {
    public static String gravarCliente(String nome, String telefone, int idade) {
        String nomeDoArquivo = "arquivo1.csv";
        String diretorio = "C:/p/diretorio_qualquer";

        try {
            File pasta = new File(diretorio);
            if (!pasta.exists()) {
                pasta.mkdirs();
            }

            File arquivo = new File(pasta, nomeDoArquivo);
            if (arquivo.createNewFile()) {
                FileWriter escritor = new FileWriter(arquivo);
                escritor.write(nome + "," + telefone + "," + idade);
                escritor.close();
                System.out.println("Arquivo criado e conteúdo escrito com sucesso.");
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar ou escrever no arquivo:");
            e.printStackTrace();
        }
        return nomeDoArquivo;
    }
}
