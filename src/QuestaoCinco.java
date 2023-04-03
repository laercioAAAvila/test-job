
public class QuestaoCinco {

	public static void main(String[] args) {

		String entrada = "janela";
		char[] passandoStringParaCaracteres = entrada.toCharArray();
		int tamanho =passandoStringParaCaracteres.length;
		char[] resultado = new char[tamanho];
		for (int i = 0; i < tamanho; i++) {
			resultado[tamanho - (i + 1)] = passandoStringParaCaracteres[i];
		}
		System.out.println(resultado);
	}

}
