## Getting Started

Seguindo a idéia de fazer um jogo de Paciência o mais modularizado possível, surgiu esse projeto.

## Criação de carta

Iniciando com a criação de classe para pode criar o objeto de carta, sendo essas utilizadas para o desenvolvimento do jogo.

Nela se encontra as informações essencias que é necessário para uma carta existir: naipe, valor, peso(para calcular a
distância entre cartas), vísibilidade e cor.

## Baralho

Foi implementado uma factory, padrão factory method, para poder gerenciar a criação de baralhos, podendo assim existir a
criação de diferentes tipos deles(caso se queira implementar outros jogos em que o baralho é diferente). Porém no jogo atual,
o Paciência, só se utiliza 1 baralho simples, sem coringa, com 52 cartas.

## Pilhas

Para organização das pilhas de fundações, estoque, fileiras e descarte. Foi utilizando também o padrão factory method

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).
