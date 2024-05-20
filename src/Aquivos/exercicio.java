package Aquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo:");
        String pasta = ler.nextLine();
        List<vos> list = new ArrayList<>();
        System.out.println("Digite o número de itens:");
        int numItems = ler.nextInt();
        ler.nextLine();
        for (int i = 0; i < numItems; i++) {
            System.out.println("Digite o nome:");
            String nome = ler.nextLine();
            System.out.println("Digite o preço:");
            double preço = ler.nextDouble();
            System.out.println("Digite a quantidade:");
            int quantidade = ler.nextInt();
            ler.nextLine();

            vos item = new vos(nome,preço, quantidade);
            list.add(item);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta))) {
            for (vos product : list) {
                bw.write(product.getNome() + "," + product.getPreço() + "," + product.getQuantidade());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader br = new BufferedReader(new FileReader(pasta))) {
            String line = br.readLine();
            while (line!=null){
                System.out.println(line);
                line=br.readLine();
            }

        }catch (IOException w ){
            System.out.println("Erro:"+w.getMessage());
        }
    }
}
