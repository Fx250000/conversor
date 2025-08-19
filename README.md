Conversor de Moedas
Conversor de moedas em Java desenvolvido como desafio da Alura. Este projeto permite converter valores entre diferentes moedas utilizando cotação em tempo real da API ExchangeRate-API.

Funcionalidades
Conversão via menu interativo no console

Suporte às seguintes conversões:

Dólar (USD) → Real brasileiro (BRL)

Real brasileiro (BRL) → Dólar (USD)

Dólar (USD) → Peso argentino (ARS)

Peso argentino (ARS) → Dólar (USD)

Dólar (USD) → Peso colombiano (COP)

Peso colombiano (COP) → Dólar (USD)

Obtenção de taxas de câmbio em tempo real da ExchangeRate-API

Tratamento básico de erros e entradas inválidas

Pré-requisitos
Java 17 ou superior

Maven 3.6+

Conta gratuita na ExchangeRate-API para obter a API Key

IntelliJ IDEA ou IDE de sua preferência

Configuração
Clone este repositório

bash
git clone https://github.com/Fx250000/conversor.git
cd conversor
Obtenha sua API Key

Cadastre-se em https://www.exchangerate-api.com/

Copie a chave recebida por e-mail

Configure a API Key

Abra o arquivo src/main/java/br/com/alura/conversordemoedas/servicos/ConsultaAPI.java

Substitua "SUA_API_KEY_AQUI" pela sua chave real:

java
private static final String API_KEY = "SUA_CHAVE_AQUI";
Build do projeto

bash
mvn clean install
Como Executar
Execute a classe principal Principal localizada em:

text
src/main/java/br/com/alura/conversordemoedas/principal/Principal.java
No IntelliJ IDEA, clique com o botão direito em Principal ► Run.
Ou pelo terminal:

bash
mvn exec:java -Dexec.mainClass="br.com.alura.conversordemoedas.principal.Principal"
Uso
Ao iniciar, um menu numérico será exibido no console.

Escolha a opção desejada (1–6) para selecionar o tipo de conversão.

Informe o valor a ser convertido.

O resultado formatado será exibido imediatamente.

Escolha “7” para sair do programa.

Estrutura de Pacotes
text
br.com.alura.conversordemoedas
├── modelos
│   ├── ExchangeResponse.java    # Mapeia JSON da API
│   └── Moeda.java               # Representa moeda e valor
├── servicos
│   ├── ConsultaAPI.java         # Cliente HTTP para ExchangeRate-API
│   └── ConversorMoeda.java      # Lógica de conversão
└── principal
    └── Principal.java           # Menu e interação com usuário
Melhorias Futuras
Histórico de conversões em sessão ou arquivo

Validação avançada de entradas (ex.: caracteres não numéricos)

Suporte a mais moedas via configuração externa

Exportar relatórios em CSV ou JSON

Desenvolvido para fins educacionais como parte do curso de Back-end Java da Alura.
