package cifraCesar;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;


	public class Leitor {

	    public static String leituraArq(String rota) {
	        String mensagem = "";
	        try {
	            FileReader arq = new FileReader(rota);
	            BufferedReader lerArq = new BufferedReader(arq);
	            String linha = "";
	            try {
	                linha = lerArq.readLine();
	                while (linha != null) {
	                    mensagem += linha;
	                    linha = lerArq.readLine();
	                }
	                arq.close();


	            } catch (IOException e) {
	                mensagem = "NÃO FOI POSSIVEL LER O ARQUIVO";
	            }
	        } catch (Exception e) {
	            mensagem = "ARQUIVO NÃO LOCALIZADO";
	        }
	        if(mensagem .contains("Erro")) {
	            return "";
	        }else {
	            return mensagem;
	        }

	   }
	 
	}
	