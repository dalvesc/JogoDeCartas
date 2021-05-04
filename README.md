#  **Como está estruturado**

Seguindo a ideia de fazer um jogo de Paciência o mais modularizado possível, surgiu este projeto.

Com toda as funcionalidades do código estando no src. A classe principal sendo ***Menu.java***.

## **MODEL**

### Carta

Iniciando com a criação de classe para pode criar o objeto de carta, sendo essas utilizadas para o desenvolvimento do jogo.

Nela se encontra as informações essencias que é necessário para uma carta existir: naipe, valor, peso(para calcular a distância entre cartas), visibilidade e cor.

### Baralho

Foi implementado uma factory, padrão factory method, para poder gerenciar a criação de baralhos, podendo assim existir a criação de diferentes tipos deles(caso se queira implementar outros jogos em que o baralho é diferente). Porém no jogo atual, o Paciência, só se utiliza 1 baralho simples, sem coringa, com 52 cartas.

### Pilhas

Para organização das pilhas de fundações, estoque, fileiras e descarte, foi utilizada uma classe abstrata Pilha que implementa os atributos/métodos comuns à todas as pilhas.

Também foram adicionados métodos específicos em algumas pilhas, nas suas respectivas classes.

## **UTIL**

Foram necessários alguns métodos em que seriam utilizados em todo o código, e já pensando em facilitar para projetos futuros, foi pensado na criação dessa pasta.

### Comparar Cartas

Classe para realizar as comparações entre as cartas. Nela temos as comparações necessárias para a utilização nas fundações e nas fileiras. Tendo também métodos para informar se pode ou não realizar a movimentação.

### Embaralhar

Classe que embaralha e retorna um array de cartas.

### Mostrar Carta

Esta classe possui um método que recebe um array de cartas e oculta todas ou as torna visíveis.

### Mover Cartas

Classe que contém os métodos que são responsáveis pelas movimentações no jogo, permitindo a movimentação de somente uma carta, ou de várias cartas em conjunto.

## **Controller**

Utiliza essa pasta para organização de comandos, junção de alguns comandos para uma melhor organização e facilitando a criação de novos controller quando quiser implementar novas coisas.

### Controller Menu

Este controller tem o objetivo de ser um inicio para qualquer jogo que possa ser implementado futuramente. Ele possui funções básicas que os jogos necessitam.

### Controller Movimentos

Este controller é responsável por pelas movimentações entre as pilhas. Contém métodos para cada movimento, utilizando os métodos da classe MoverCartas.

### Controller Paciência

Este controller possui as regras especifícas utilizadas para o jogo de paciências.

## **VIEW**

Pacote responsável pela interface do código. Contendo todos os prints e comunicações com o usuário.

### Menu

Sendo a responsável para inicialização do jogo, em que pergunta pro usuário se quer iniciar a partida de paciência ou encerrar o programa. Montado dessa forma para facilitar a criação de um menu para qualquer outro jogo que possa vir ser implementado.

### Menu Paciência

Este menu é responsável por todas opções de jogadas disponíveis ao jogo Paciência. Dividido em "dois" menus, um para escolher uma próxima jogada, como por exemplo mover cartas, e outro com as movimentações possíveis entre as pilhas. No "primeiro" menu é sempre verificado se o jogo foi ganho para que possa ser finalizado assim que o usuário complete as quatro fundações.

## **Facade**
O padrão estrutural Facade foi utilizado para fornecer uma interface mais simples ao Menu Paciência. Assim, esta classe reune todas as funcionalidades referentes aos três controllers e o manu pode se comunicar com elas indiretamente apenas pelo Facade.

## **Factory Method**
O padrão criacional Factory Method foi utilizado com o objetivo de diminuir as responsabilidades da classe Baralho e em sua facilidade de implementações de outros jogos com baralhos diferentes. O BaralhoFactory é responsável pela criação do baralho, quantidade de baralhos e por embaralha-los.

## **Iterator**
O padrão comportamental Iterator foi usado para percorrer os elementos de qualquer pilha.


## PADRÕES QUE PODERIAM SER UTILIZADOS

Uma das maneiras de melhorar a organização do programa seria com a utilização de Factory Method para a organização dos controllers. Com ele, teríamos o controller principal que seria o padrão para todos os tipos de jogo de cartas e como subgrupo dele teria os específicos para cada jogo, com suas próprias regras.

## PONTOS FORTES E FRACOS

Apesar de conseguir separar muitos métodos para facilitar a implementação de novas funcionalidades, ainda têm coisas que poderiam ser melhoradas e separadas para se tornar um código melhor e evitar ainda mais repetição do código, como é no caso de alguns métodos em *ControllerPaciencia*.

Utilizamos o padrão factory para que caso no futuro se decida implementar jogos que utilizem baralhos diferentes, com menos cartas ou utilizando a carta coringa, esse processo de alteração se torne mais facilitado.

## MELHORIAS

Uma melhorias que pode ser feita no futuro é a implantação de exceções para o tratamento de alguns erros do programa.

# MODELO CONCEITUAL
<img src="./img/diagramas-uml/DiagramaConceitualUML.png"/>

Pode ser acessado pelo link: <https://github.com/dalvesc/JogoDeCartas/blob/main/img/diagramas-uml/DiagramaConceitualUML.png>

# MODELO DE BAIXO NÍVEL

