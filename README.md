# DesafioJavaPuro

Este é um exemplo de um programa Java simples que demonstra o uso de um contador global compartilhado por várias threads. O programa usa o padrão Singleton para garantir que apenas uma instância do contador seja criada e compartilhada entre as threads.

Requisitos
Certifique-se de ter o Java JDK instalado em seu ambiente de desenvolvimento.


Como funciona
O programa consiste em duas classes principais:

App.java: Esta é a classe principal do programa que inicia duas threads para incrementar o contador global em paralelo e, em seguida, imprime o valor do contador na saída padrão.

GlobalCounter.java: Esta classe implementa o contador global como um Singleton. Apenas uma instância do contador é criada e compartilhada entre as threads. Ele possui métodos para incrementar o contador e obter o valor atual do contador.

Observações
A classe GlobalCounter implementa um Singleton simples, garantindo que apenas uma instância do contador seja criada.
No entanto, a operação de incremento não é protegida de forma síncrona, o que pode levar a problemas de concorrência em cenários mais complexos. 
Para uma sincronização mais robusta, considere usar synchronized no método increment().

## Contribuições

Sinta-se à vontade para contribuir com melhorias para este projeto. Basta abrir uma "Pull Request" e eu ficarei feliz em revisar e mesclar suas contribuições.

