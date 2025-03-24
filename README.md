# Problema Pedido - Java

Durante meu estudo sobre enumerações e composição na linguagem Java, explorei como essas técnicas são fundamentais para melhorar a organização e flexibilidade do código. Aprendi que as enumerações são um tipo especial de classe que permite representar um conjunto de constantes, facilitando a gestão de valores fixos, como dias da semana ou status de um pedido.

Além disso, estudei a composição, que é um tipo de associação entre classes onde um objeto é composto por outros objetos, criando uma relação "tem-um" ou "tem-vários". Compreendi a importância de usar a composição para modelar cenários reais de forma mais modular e reutilizável.

Em relação à representação UML, aprendi como diagramas de classe podem ser utilizados para ilustrar a estrutura do código, incluindo enumerações e a composição entre objetos.

Outro ponto explorado foi a conversão de String para enum. No Java, a conversão é feita de forma simples com o método valueOf(), que facilita a manipulação de entradas de texto como valores enum.

Por fim, também estudei as categorias de classes, entendendo a importância de classificar classes de acordo com seu papel e comportamento no sistema, como classes de controle, entidades e utilitárias. Esse estudo aprimorou minha compreensão sobre design orientado a objetos e práticas de programação eficientes.

Esse aprendizado me proporcionou uma visão mais clara sobre como criar sistemas Java bem estruturados, reutilizáveis e de fácil manutenção.
#
### Problema
![UML - Order](https://github.com/AndreyNicollas/Composicao_Enumeracao_ProblemOrder/blob/main/Captura%20de%20tela%202025-03-24%20115217.png)
#
### Exemplos
```
Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1
Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00
```
____
