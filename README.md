# adv-senha-java
Este é um programa simples em Java que gera tentativas aleatórias para descobrir uma senha fornecida pelo usuário. Ele registra o número de tentativas necessárias para coincidir com cada caractere da senha.

## Como Usar:
1. Clone ou faça o download deste repositório.
2. Compile o código-fonte Java para gerar o arquivo executável.
3. O programa solicitará que você insira a senha a ser descoberta.
4. Digite a senha e pressione Enter.
5. O programa gerará tentativas aleatórias até que todas as letras da senha sejam correspondidas. Em seguida, ele exibirá o número total de tentativas realizadas.

## Método:
- O programa usa a classe `Random` do pacote `java.util` para gerar números aleatórios.
- Esses números são convertidos para char, no caso o java automaticamente o converte para o caractere correspondente a posição que o número indica na tabela ASCII.
- O programa utiliza um loop `while` para comparar as tentativas geradas aleatoriamente com os caracteres da senha até que todos sejam correspondidos. Isso é feito para poupar tempo de processamento, já que comparar uma string inteira levaria horas dependendo do tamanho da senha.
