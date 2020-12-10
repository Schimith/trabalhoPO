package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int algoritimo = 0, auto = 0;
		Scanner ler = new Scanner(System.in);
		String[] nome = { "HeapSort", "QuickSort", "ABB", "AVL", "Hash" };

		while (auto > 0 || auto < 3) {
			System.out.print("Deseja executar os algoritimos serapado? 1 - sim, 2 - não");
			auto = ler.nextInt();

			switch (auto) {
			case 1:
				System.out.print("Algoritmos\nHeapSort - 1\nQuickSort - 2\nABB - 3\nAVL - 4\nHash - 5\n");
				System.out.print("Qual Algoritimo deseja executar: ");
				algoritimo = ler.nextInt();

				switch (algoritimo) {
				case 1:
					Algoritimos();
					int res = ler.nextInt();
					Arquivos(res, nome[algoritimo - 1]);

					return;
				case 2:
					Algoritimos();
					res = ler.nextInt();
					Arquivos(res, nome[algoritimo - 1]);

					return;
				case 3:
					Algoritimos();
					res = ler.nextInt();
					Arquivos(res, nome[algoritimo - 1]);

					return;
				case 4:
					Algoritimos();
					res = ler.nextInt();
					Arquivos(res, nome[algoritimo - 1]);

					return;
				case 5:
					Algoritimos();
					res = ler.nextInt();
					Arquivos(res, nome[algoritimo - 1]);

					return;
				default:
					System.out.print("Selecione um dos itens");
				}

				return;
			case 2:
				long tempoInicial = System.currentTimeMillis();

				for (int i = 0; i < 5; i++) {
					Arquivos(1, nome[0]);
				}

				long tempoFinal = System.currentTimeMillis();
				System.out.println("O tempo médio de executado em = " + (tempoFinal - tempoInicial) / 5 + " ms");

				for (int i = 1; i < 16; i++) {
					Arquivos(i, nome[0]);
				}

				for (int i = 1; i < 16; i++) {
					Arquivos(i, nome[1]);
				}

				break;
			default:
				System.out.print("Selecione um dos itens");
			}
		}
		// fecha o scanner
		ler.close();
	}

	public static String TipoConta(String conta) {

		if (conta.length() < 7) {
			return "Conta Comum";
		}

		return "Conta Poupança";
	}

	public static void Algoritimos() {
		System.out.println("Qual arquivo a ser utilizado (/arqvs) ?)");
		System.out.print(
				"1 - 500 registros aleatorios \n2 - 1000 registros aleatorios\n3 - 5000 registros aleatorios\n4 - 10000 registros aleatorios\n5 - 50000 registros aleatorios\n");
		System.out.print(
				"6 - 500 registros ordenados \n7 - 1000 registros ordenados\n8 - 5000 registros ordenados\n9 - 10000 registros ordenados\n10 - 50000 registros ordenados\n");
		System.out.print(
				"11 - 500 registros invertidos \n12 - 1000 registros invertidos\n13 - 5000 registros invertidos\n14 - 10000 registros invertidos\n15 - 50000 registros invertidos\n");
		System.out.print("16 - Sair\n");
		System.out.print("Digite a opcao :");
	}

	public static void Arquivos(int tipo, String algoritimo) {
		String entrada, saida, pesquisa;

		switch (tipo) {
		case 1:
			entrada = "arqvs/conta500alea.txt";
			saida = "result/" + algoritimo + "Alea500.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaAlea500.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 2:
			entrada = "arqvs/conta1000alea.txt";
			saida = "result/" + algoritimo + "Alea1000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaAlea1000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 3:
			entrada = "arqvs/conta5000alea.txt";
			saida = "result/" + algoritimo + "Alea5000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaAlea5000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 4:
			entrada = "arqvs/conta10000alea.txt";
			saida = "result/" + algoritimo + "Alea10000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaAlea10000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 5:
			entrada = "arqvs/conta50000alea.txt";
			saida = "result/" + algoritimo + "Alea50000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaAlea50000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);
				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 6:
			entrada = "arqvs/conta500ord.txt";
			saida = "result/" + algoritimo + "Ord500.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaOrd500.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);
				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 7:
			entrada = "arqvs/conta1000ord.txt";
			saida = "result/" + algoritimo + "Ord1000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaOrd1000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 8:
			entrada = "arqvs/conta5000ord.txt";
			saida = "result/" + algoritimo + "Ord5000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaOrd5000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);
				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 9:
			entrada = "arqvs/conta10000ord.txt";
			saida = "result/" + algoritimo + "Ord10000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaOrd10000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);
				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 10:
			entrada = "arqvs/conta50000ord.txt";
			saida = "result/" + algoritimo + "Ord50000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaOrd50000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 11:
			entrada = "arqvs/conta500inv.txt";
			saida = "result/" + algoritimo + "Inv500.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaInv500.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 12:
			entrada = "arqvs/conta1000inv.txt";
			saida = "result/" + algoritimo + "Inv1000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaInv1000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 13:
			entrada = "arqvs/conta5000inv.txt";
			saida = "result/" + algoritimo + "Inv5000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaInv5000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 14:
			entrada = "arqvs/conta10000inv.txt";
			saida = "result/" + algoritimo + "Inv10000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaInv10000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		case 15:
			entrada = "arqvs/conta50000inv.txt";
			saida = "result/" + algoritimo + "Inv50000.txt";
			pesquisa = "result/" + algoritimo + "_PesquisaBinariaInv50000.txt";

			switch (algoritimo) {
			case "QuickSort":
				QuickSort(entrada, saida, pesquisa);
				return;
			case "HeapSort":
				HeapSort(entrada, saida, pesquisa);
				return;
			case "ABB":
				Abb(entrada, saida, pesquisa);

				return;
			case "AVL":

				return;
			case "Hash":

				return;
			}

			return;
		}
		while (tipo != 16)
			;
	}

	// ABB
	public static void Abb(String entrada, String saida, String pesquisa) {
		abb arvore = new abb();
		// listas para guardar os dados separadamente
		ArrayList<Long> cpf = new ArrayList<Long>();
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<Integer> agencia = new ArrayList<Integer>();
		ArrayList<Long> conta = new ArrayList<Long>();
		ArrayList<Double> saldo = new ArrayList<Double>();

		// Leitura do arquivo
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(entrada));

			String linha = leitor.readLine();
			while (linha != null) {

				String guardarDados[] = linha.split(";");

				cpf.add(Long.parseLong(guardarDados[0]));
				nome.add(guardarDados[1]);
				agencia.add(Integer.parseInt(guardarDados[2]));
				conta.add(Long.parseLong(guardarDados[3]));
				saldo.add(Double.parseDouble(guardarDados[4]));

				linha = leitor.readLine();
			}
			leitor.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		// Ordenacao por cpf
		// Quicksort com vetor
		// Cria um vetor e passar os dados da lista para ele.

		// cpf
		Long[] c = new Long[cpf.size()];
		// nome
		String[] n = new String[cpf.size()];
		// agencia
		Integer[] ag = new Integer[cpf.size()];
		// conta
		Long[] co = new Long[cpf.size()];
		// saldo
		Double[] s = new Double[cpf.size()];

		// Inicia a contagem de tempo
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < cpf.size(); i++) {
			c[i] = cpf.get(i).longValue();
			n[i] = nome.get(i);
			ag[i] = agencia.get(i).intValue();
			co[i] = conta.get(i).longValue();
			s[i] = saldo.get(i).doubleValue();
		}

		ArrayList<Long> cliente = new ArrayList<Long>();

		try {
			BufferedReader leitor = new BufferedReader(new FileReader("arqvs/Conta.txt"));

			String linha = leitor.readLine();
			while (linha != null) {

				String guardarDados = linha;
				cliente.add(Long.parseLong(guardarDados));
				linha = leitor.readLine();

			}

			leitor.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		for (int z = 0; z < c.length; z++) {
			arvore.add(c[z]);
		}

		// cpf
		Long[] ccliente = new Long[cliente.size()];

		for (int i = 0; i < cliente.size(); i++) {
			ccliente[i] = cliente.get(i).longValue();
		}

		// ABB
		// int[] pesc = new int[ccliente.length];

		// Gravacao do novo arquivo
		try {
			// Creates a FileWriter
			FileWriter file = new FileWriter(saida);

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);

			// Writes the string to the file
			for (int r = 0; r < ccliente.length; r++) {
				if (arvore.contains(ccliente[r]) > 0) {
					// pesc = r;
					System.out.print(arvore.contains(ccliente[r]));
				} else {
					output.write(
							"CPF " + ccliente[r] + ":\n" + "NÃO HÁ NENHUM REGISTRO COM O CPF " + ccliente[r] + "\n\n");
				}
			}

			// Flushes data to the destination
			System.out.println("Os arquivos foram mandados para pasta /result.");

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}

		// Finaliza a contagem de tempo
		long tempoFinal = System.currentTimeMillis();
		System.out.println();
		System.out.println("ABB Executada em = " + (tempoFinal - tempoInicial) + " ms");
	}

	// Pesquisa Binaria
	@SuppressWarnings("null")
	public static void PesquisaBinaria(String entrada, String saida) {
		// listas para guardar os dados separadamente
		ArrayList<Long> cpf = new ArrayList<Long>();
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<Integer> agencia = new ArrayList<Integer>();
		ArrayList<Long> conta = new ArrayList<Long>();
		ArrayList<Double> saldo = new ArrayList<Double>();

		// Leitura do arquivo
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(entrada));

			String linha = leitor.readLine();
			while (linha != null) {

				String guardarDados[] = linha.split(";");

				cpf.add(Long.parseLong(guardarDados[0]));
				nome.add(guardarDados[1]);
				agencia.add(Integer.parseInt(guardarDados[2]));
				conta.add(Long.parseLong(guardarDados[3]));
				saldo.add(Double.parseDouble(guardarDados[4]));

				linha = leitor.readLine();
			}
			leitor.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		// Ordenacao por cpf
		// Quicksort com vetor
		// Cria um vetor e passar os dados da lista para ele.

		// cpf
		Long[] c = new Long[cpf.size()];
		// nome
		String[] n = new String[cpf.size()];
		// agencia
		Integer[] ag = new Integer[cpf.size()];
		// conta
		Long[] co = new Long[cpf.size()];
		// saldo
		Double[] s = new Double[cpf.size()];

		// Inicia a contagem de tempo
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < cpf.size(); i++) {
			c[i] = cpf.get(i).longValue();
			n[i] = nome.get(i);
			ag[i] = agencia.get(i).intValue();
			co[i] = conta.get(i).longValue();
			s[i] = saldo.get(i).doubleValue();
		}

		// Vetores carregados passar para o quicksort
		// c,0,cpf.size,n,ag,co,s

		ArrayList<Long> cliente = new ArrayList<Long>();

		try {
			BufferedReader leitor = new BufferedReader(new FileReader("arqvs/Conta.txt"));

			String linha = leitor.readLine();
			while (linha != null) {

				String guardarDados = linha;
				cliente.add(Long.parseLong(guardarDados));
				linha = leitor.readLine();

			}

			leitor.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		// cpf
		Long[] ccliente = new Long[cliente.size()];

		for (int i = 0; i < cliente.size(); i++) {
			ccliente[i] = cliente.get(i).longValue();
		}

		// Pesquisa binaria
		int[] pesc = new int[ccliente.length];

		for (int r = 0; r < ccliente.length; r++) {

			int res = Main.pesbin.BuscaBinaria(c, ccliente[r]);
			pesc[r] = res;

		}

		// Gravacao do novo arquivo

		try {
			// Creates a FileWriter
			FileWriter file = new FileWriter(saida);

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);

			// Writes the string to the file
			for (int i = 0; i < ccliente.length; i++) {
				if (pesc[i] > 0) {
					int verifica = pesc[i];
					Double saldoTotal = 0.0;

					output.write("CPF " + c[pesc[i]] + " NOME " + n[pesc[i]] + "\r\n");
					do {
						output.write("Ag: " + ag[verifica] + " " + TipoConta(co[verifica].toString()) + " "
								+ co[verifica] + " Saldo: R$ " + s[verifica] + "\r\n");

						saldoTotal += s[verifica];
						verifica++;
					} while (c[pesc[i]] == c[verifica]);
					output.write("Saldo total: " + saldoTotal + "\n\n");

				} else {
					output.write(
							"CPF " + ccliente[i] + ":\n" + "NÃO HÁ NENHUM REGISTRO COM O CPF " + ccliente[i] + "\n\n");
				}
			}
			// Flushes data to the destination
			System.out.println("Os arquivos foram mandados para pasta /result.");

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}

		// Finaliza a contagem de tempo
		long tempoFinal = System.currentTimeMillis();
		System.out.println();
		System.out.println("Pesquisa Binária Executada em = " + (tempoFinal - tempoInicial) + " ms");
	}

	// HeapSort
	public static void HeapSort(String entrada, String saida, String pesquisa) {
		// listas para guardar os dados separadamente
		ArrayList<Long> cpf = new ArrayList<Long>();
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<Integer> agencia = new ArrayList<Integer>();
		ArrayList<Long> conta = new ArrayList<Long>();
		ArrayList<Double> saldo = new ArrayList<Double>();

		// Leitura do arquivo
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(entrada));

			String linha = leitor.readLine();
			while (linha != null) {

				String guardarDados[] = linha.split(";");

				cpf.add(Long.parseLong(guardarDados[0]));
				nome.add(guardarDados[1]);
				agencia.add(Integer.parseInt(guardarDados[2]));
				conta.add(Long.parseLong(guardarDados[3]));
				saldo.add(Double.parseDouble(guardarDados[4]));

				linha = leitor.readLine();
			}
			leitor.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		// Ordenacao por cpf
		// Quicksort com vetor
		// Cria um vetor e passar os dados da lista para ele.

		// cpf
		Long[] c = new Long[cpf.size()];
		// nome
		String[] n = new String[cpf.size()];
		// agencia
		Integer[] ag = new Integer[cpf.size()];
		// conta
		Long[] co = new Long[cpf.size()];
		// saldo
		Double[] s = new Double[cpf.size()];

		// Inicia a contagem de tempo
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < cpf.size(); i++) {
			c[i] = cpf.get(i).longValue();
			n[i] = nome.get(i);
			ag[i] = agencia.get(i).intValue();
			co[i] = conta.get(i).longValue();
			s[i] = saldo.get(i).doubleValue();
		}

		// Vetores carregados passar para o quicksort
		// c,0,cpf.size,n,ag,co,s
		Main.heapsort.ordem(c, 0, cpf.size(), n, ag, co, s);

		// Os vetores c e n estao ordenados pelo valor de c(cpf)
		// Agora ï¿½ sï¿½ imprimir

		// Imprime no console
		// for(int i=0; i<cpf.size(); i++){
		// System.out.println(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" +
		// s[i]);
		// }

		// Gravacao do novo arquivo
		try {
			// Creates a FileWriter
			FileWriter file = new FileWriter(saida);

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);

			// Writes the string to the file
			for (int i = 0; i < cpf.size(); i++) {
				output.write(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" + s[i] + "\n");
			}
			// Flushes data to the destination
			System.out.println("Os arquivos foram mandados para pasta /result.");

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}

		// Finaliza a contagem de tempo
		long tempoFinal = System.currentTimeMillis();
		System.out.println();
		System.out.println("HeapSort Executado em = " + (tempoFinal - tempoInicial) + " ms");

		// Pesquisa binaria
		PesquisaBinaria(saida, pesquisa);
	}

	// QuickSort
	public static void QuickSort(String entrada, String saida, String pesquisa) {
		// listas para guardar os dados separadamente
		ArrayList<Long> cpf = new ArrayList<Long>();
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<Integer> agencia = new ArrayList<Integer>();
		ArrayList<Long> conta = new ArrayList<Long>();
		ArrayList<Double> saldo = new ArrayList<Double>();

		// Leitura do arquivo
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(entrada));

			String linha = leitor.readLine();
			while (linha != null) {

				String guardarDados[] = linha.split(";");

				cpf.add(Long.parseLong(guardarDados[0]));
				nome.add(guardarDados[1]);
				agencia.add(Integer.parseInt(guardarDados[2]));
				conta.add(Long.parseLong(guardarDados[3]));
				saldo.add(Double.parseDouble(guardarDados[4]));

				linha = leitor.readLine();
			}
			leitor.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		// Ordenacao por cpf
		// Quicksort com vetor
		// Cria um vetor e passar os dados da lista para ele.

		// cpf
		Long[] c = new Long[cpf.size()];
		// nome
		String[] n = new String[cpf.size()];
		// agencia
		Integer[] ag = new Integer[cpf.size()];
		// conta
		Long[] co = new Long[cpf.size()];
		// saldo
		Double[] s = new Double[cpf.size()];

		// Inicia a contagem de tempo
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < cpf.size(); i++) {
			c[i] = cpf.get(i).longValue();
			n[i] = nome.get(i);
			ag[i] = agencia.get(i).intValue();
			co[i] = conta.get(i).longValue();
			s[i] = saldo.get(i).doubleValue();
		}

		// Vetores carregados passar para o quicksort
		// c,0,cpf.size,n,ag,co,s
		Main.quick.quick_sort(c, 0, cpf.size(), n, ag, co, s);

		// Os vetores c e n estao ordenados pelo valor de c(cpf)
		// Agora ï¿½ sï¿½ imprimir

		// Imprime no console
		// for(int i=0; i<cpf.size(); i++){
		// System.out.println(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" +
		// s[i]);
		// }

		// Gravacao do novo arquivo
		try {
			// Creates a FileWriter
			FileWriter file = new FileWriter(saida);

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);

			// Writes the string to the file
			for (int i = 0; i < cpf.size(); i++) {
				output.write(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" + s[i] + "\n");
			}
			// Flushes data to the destination
			System.out.println("Os arquivos foram mandados para pasta /result.");

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}

		// Finaliza a contagem de tempo
		long tempoFinal = System.currentTimeMillis();
		System.out.println();
		System.out.println("QuickSort Executado em = " + (tempoFinal - tempoInicial) + " ms");

		// Pesquisa binaria
		PesquisaBinaria(saida, pesquisa);
	}

}
