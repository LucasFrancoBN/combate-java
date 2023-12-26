# Desafio: Combate

Em um jogo PVP, cada participante possui um campeão, sendo este caracterizado por três atributos: nome, vida e armadura. O embate entre os campeões é
estruturado em turnos, durante os quais cada protagonista realiza ataques recíprocos. Nesse contexto, o objetivo do programa é ler e instanciar dois campeões, determinar o número de 
turnos e apresentar os dados relativos à vida de cada campeão ao término de cada ciclo. Caso um campeão venha a ser derrotado durante os turnos, o programa irá exibir no console a 
mensagem "FIM DE JOGO". As regras para este desafio são:

1. **Ataque:**
   - A quantidade de vida de um campeão deve ser subtraída de acordo com a quantidade de ataque do outro campeão, menos a quantidade de armadura que o campeão atacado possui.
     A quantidade resultante de vida não pode ser menor que 0.
    - Não importa o quanto de armadura o campeão atacado tem, deve-se descontar 1 ponto de vida dele.

2. **Diagrama de classe UML:**
   - Seguir exatamente o diagrama de classe abaixo:
   
   ![Diagrama de classe](https://github.com/LucasFrancoBN/bar-java/blob/master/img/diagrama_classe.png)
   
3. **Métodos:**
   - takeDamage: deve fazer com que o dano recebido venha do campeão passado como argumento do método.
   - status: deve retornar o nome e a situação de vida do campeão, inclusive a palavra "morreu" se a vida do campeão for igual a zero.   

## Exemplo
```plaintext
Digite os dados do primeiro campeão:
Nome: Darius
Vida inicial: 50
Ataque: 8
Armadura: 1

Digite os dados do segundo campeão:
Nome: Fiora
Vida inicial: 40
Ataque: 30
Armadura: 10

Quantos turnos você deseja executar? 4

Resultado do turno 1:
Darius: 21 de vida
Fiora: 39 de vida

Resultado do turno 2:
Darius: 0 de vida (morreu)
Fiora: 38 de vida

FIM DO COMBATE
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/combate-java.git

# Acesse o diretório do projeto
cd combate-java/src
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java

# Execute o programa
java Program
```
