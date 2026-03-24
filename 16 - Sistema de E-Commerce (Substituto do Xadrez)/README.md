<h1>Sistema de E-Commerce em Java 🛒</h1>

Este projeto foi desenvolvido como parte dos meus estudos em Java para simular as operações de uma plataforma 
de vendas real. O objetivo principal foi consolidar conceitos de Orientação a Objetos e aplicar uma lógica robusta
de back-end para processos de checkout e inventário.


<h2>🚀 Funcionalidades</h2>

✔ Gestão de Estoque Independente: Implementação de uma estrutura que controla a disponibilidade de produtos de forma isolada, garantindo a integridade dos dados entre estoque e carrinho.

✔ Fluxo de Status de Pedido: Acompanhamento completo da compra (Aguardando Pagamento, Processando, Enviado e Entregue) utilizando Enums para garantir uma lógica consistente.

✔ Mecanismo de Checkout: Processamento de pagamentos via Pix (com desconto de 5%), Débito e Crédito.

✔ Tratamento de Exceções: Uso de exceções personalizadas (DomainException) para validar regras de negócio, como a tentativa de compra de produtos sem estoque.

✔ Interface via Console: Menu interativo para listagem de produtos, manipulação do carrinho e finalização de pedidos.

<h2>🛠️ Tecnologias Utilizadas</h2>

✔ Java 17 (ou a versão que você usou)

✔ ConcreteScanner API para entrada de dados

✔ Paradigma de Orientação a Objetos (POO)


<h2>📂 Estrutura do Projeto</h2>

✔ O projeto segue uma organização baseada em responsabilidades claras:

✔ application: Contém o ponto de entrada do sistema (Program2).

✔ model.entities: Entidades principais como Product, Client, Order, OrderItem e Estoque.

✔ model.enums: Gerenciamento de estados de pedidos.

✔ model.exception: Exceções personalizadas para o domínio do sistema.
