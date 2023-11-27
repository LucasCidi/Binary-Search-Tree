import java.util.Scanner;

public class MainTree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        int op;
        int value;

        do {
            System.out.println("\nÁRVORE BINÁRIA DE PESQUISA");
            System.out.println("---------------------------------------");
            System.out.println("1 | Adicionar nodo");
            System.out.println("2 | Remover nodo");
            System.out.println("3 | Pesquisar nodo");
            System.out.println("4 | Exibir a árvore");
            System.out.println("5 | Mostrar informações");
            System.out.println("6 | Mostrar caminhamentos");
            System.out.println("7 | Soma de valores entre nodos");
            System.out.println("8 | Esvaziar árvore");
            System.out.println("9 | Menor valor da árvore");
            System.out.println("10| Maior valor da árvore");
            System.out.println("11| Número de folhas da árvore");
            System.out.println("12| Soma de um caminho da árvore");
            System.out.println("0 | Sair do programa");
            System.out.println("---------------------------------------");
            System.out.println("Digite a opção desejada: ");

            op = scan.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Informe um valor inteiro:");
                    value = scan.nextInt();
                    tree.add(value);
                }
                case 2 -> {
                    System.out.println("Informe um valor inteiro:");
                    value = scan.nextInt();
                    if (!tree.remove(value))
                        System.out.println("Valor não encontrado!");
                }
                case 3 -> {
                    System.out.println("Informe um valor inteiro:");
                    value = scan.nextInt();
                    if (tree.contains(value) != null)
                        System.out.print("Valor encontrado!");
                    else
                        System.out.println("Valor não encontrado!");
                }
                case 4 -> {
                    tree.printTree();
                }
                case 5 -> {
                    tree.treeInfo();
                }
                case 6 -> {
                    tree.caminhamentos();
                }
                case 7 -> {
                    // tree.sumBetween();
                }
                case 8 -> {
                    tree.clearTree();
                }
                case 9 -> {
                    if (tree.minNode() == Integer.MIN_VALUE) System.out.println("Arvore vazia!");
                    else System.out.println(tree.minNode());
                }
                case 10 -> {
                    if (tree.maxNode() == Integer.MAX_VALUE) System.out.println("Arvore vazia!");
                    else System.out.println(tree.maxNode());
                }
                case 11 -> {

                }
                case 12 -> {
                    System.out.println("Informe o primeiro elemento do caminho: ");
                    int start = scan.nextInt();
                    System.out.println("Informe o ultimo elemento do caminho: ");
                    int end = scan.nextInt();

                    if (tree.countBetween(start, end) == Integer.MIN_VALUE) System.out.println("Árvore vazia!");
                    System.out.println(tree.countBetween(start, end));
                }
            }
        } while (op != 0);
        scan.close();
    }
}