package application.src;

import model.entities.src.*;
import model.enums.src.OrderStatus;
import model.exception.src.DomainException;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<OrderItem> items = new ArrayList<>();

        Product product1 = new Product("TV", 1200.00);
        Product product2 = new Product("Celular", 3202.90);
        Product product3 = new Product("Pc", 5020.00);

        OrderItem orderItem1 = new OrderItem(12, product1.getPrice(), product1);
        OrderItem orderItem2 = new OrderItem(3, product2.getPrice(), product2);
        OrderItem orderItem3 = new OrderItem(21, product3.getPrice(), product3);

        Order carrinho = new Order();
        Estoque estoque = new Estoque();

        estoque.addItem(orderItem1);
        estoque.addItem(orderItem2);
        estoque.addItem(orderItem3);

        boolean menuEcommerce = true;
        while (menuEcommerce) {
            System.out.println("=== MENU E-COMMERCE ===\n" +
                    "1. Listar Produtos\n" +
                    "2. Adicionar Item ao Carrinho\n" +
                    "3. Remover Item do Carrinho\n" +
                    "4. Ver Total do Pedido\n" +
                    "5. Finalizar Pedido (checkout)\n" +
                    "6. Sair");

            Integer menu = sc.nextInt();
            try {
                if (menu.equals(1)) {
                    for (OrderItem item : estoque.items) {
                        System.out.println(item.getProduct());
                    }
                } else if (menu.equals(2)) {
                    while (true) {
                        boolean encontradoDois = false;
                        System.out.println("Qual produto você quer adicionar ao carrinho?\n");
                        String clientePedido = sc.next();
                        for (OrderItem pedido : estoque.items) {
                            if (clientePedido.equals(pedido.getNameLista())) {
                                System.out.println("Produto encontrado!");
                                carrinho.addItem(pedido);
                                estoque.removaItems(pedido);
                                carrinho.setStatus(OrderStatus.PENDING_PAYMENT);
                                encontradoDois = true;
                                break;
                            }
                        }

                        if (!encontradoDois) {
                            System.out.println("Produto não encontrado.");
                        }

                        System.out.println("O que você deseja fazer agora?\n1 - Adicionar um produto.\n2 - Voltar ao menu.\n");
                        Integer opcao = sc.nextInt();
                        if (opcao.equals(2)) {
                            System.out.println("Voltando ao menu...");
                            break;
                        }
                    }

                } else if (menu.equals(3)) {
                    System.out.println("Qual produto você deseja retirar do carrinho?");
                    String clientePedido = sc.next();
                    OrderItem itemParaRemover = null;

                    // 1. Procurar o item no carrinho
                    for (OrderItem pedidoTres : carrinho.items) {
                        if (clientePedido.equalsIgnoreCase(pedidoTres.getNameLista())) {
                            itemParaRemover = pedidoTres;
                            break;
                        }
                    }

                    if (itemParaRemover != null) {
                        itemParaRemover.setQuantityForMore(1);

                        carrinho.items.remove(itemParaRemover);

                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado no carrinho.");
                    }

                } else if (menu.equals(4)) {
                    if (carrinho.items.size() > 0) {
                        System.out.println("Segue carrinho até o momento:");
                        for (OrderItem lista : carrinho.items) {
                            System.out.println("Produto: " + lista.getNameLista());
                        }
                    } else {
                        System.out.println("Carrinho Vazio...");
                    }
                }

                else if (menu.equals(5)) {
                    Double valorFinal = 0.0;
                    System.out.println("Segue nota do pedido:");
                    for (OrderItem checkout : carrinho.items) {
                        System.out.println(checkout.getProduct());
                        valorFinal += checkout.getPrice();
                    }
                    if (valorFinal <= 0) {
                        System.out.println("Carrinho vazio...\n");
                    } else {
                                carrinho.setStatus(OrderStatus.PROCESSING);
                                System.out.println(carrinho.getStatus());
                                System.out.println("Valor a pagar: " + valorFinal);
                                System.out.println("============================");
                                System.out.println("Qual será a forma de pagamento?");
                                System.out.println("1 - Pix\n2 - Débito\n3 - Crédito\n");
                                int choose = sc.nextInt();

                                System.out.println("Digite seu nome: ");
                                String nome = sc.next();
                                System.out.println("Digite seu e-mail: ");
                                String email = sc.next();

                                Client cliente = new Client(nome, email);

                                switch (choose) {
                                    case 1:
                                        System.out.println("\nEscolha: Pix");
                                        System.out.println("\nVocê ganhou um desconto de 5%");
                                        Double desc = 0.05;
                                        Double prim = valorFinal - (desc * valorFinal);
                                        System.out.println("Valor total:" + prim);
                                        System.out.println("PAGO!\n");
                                        break;

                                    case 2:
                                        System.out.println("\nEscolha: Débito");
                                        System.out.println("Valor total: " + (valorFinal));
                                        System.out.println("PAGO!\n");
                                        break;

                                    case 3:
                                        System.out.println("\nEscolha: Crédito");
                                        System.out.println("Valor total: " + (valorFinal));
                                        System.out.println("PAGO!\n");
                                        break;
                                    default:
                                        System.out.println("Opção Inválida!");
                                }

                                System.out.println("=== Nota Fiscal ===");
                                System.out.println(cliente + "\n");
                                System.out.println("Seu pedido irá chegar de 3 À 5 dias!");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println(".");
                                System.out.println(".");
                                carrinho.setStatus(OrderStatus.SHIPPED);
                                carrinho.setStatus(OrderStatus.DELIVERED);
                                System.out.println("Status atual: " + carrinho.getStatus());

                                break;
                    }
                }

                else if (menu.equals(6)) {
                    System.out.println("Programa encerrado.");
                    break;
                } else {
                    System.out.println("Opção não encontrada!");
                }
            } catch (DomainException e) {
                System.out.println("Erro na operação: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: Ocorreu um erro no sistema.");
                sc.nextLine();
            }
        }
    }
}
