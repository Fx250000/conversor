# Conversor de Moedas

Conversor de moedas em Java desenvolvido como desafio da Alura. Este projeto permite converter valores entre diferentes moedas utilizando cotação em tempo real da API ExchangeRate-API.

## Funcionalidades

- Conversão via menu interativo no console
- Suporte às seguintes conversões:
  1. Dólar (USD) → Real brasileiro (BRL)
  2. Real brasileiro (BRL) → Dólar (USD)
  3. Dólar (USD) → Peso argentino (ARS)
  4. Peso argentino (ARS) → Dólar (USD)
  5. Dólar (USD) → Peso colombiano (COP)
  6. Peso colombiano (COP) → Dólar (USD)
- Obtenção de taxas de câmbio em tempo real da ExchangeRate-API
- Tratamento básico de erros e entradas inválidas

## Pré-requisitos

- Java 17 ou superior
- Maven 3.6+
- Conta gratuita na ExchangeRate-API para obter a API Key
- IntelliJ IDEA ou IDE de sua preferência

## Configuração

### 1. Clone este repositório

```bash
git clone https://github.com/Fx250000/conversor.git
cd conversor
```

### 2. Obtenha sua API Key

- Cadastre-se em https://www.exchangerate-api.com/
- Copie a chave recebida por e-mail

### 3. Configure a API Key

- Abra o arquivo `src/main/java/br/com/alura/conversordemoedas/servicos/ConsultaAPI.java`
- Substitua `"SUA_API_KEY_AQUI"` pela sua chave real:

```java
private static final String API_KEY = "SUA_CHAVE_AQUI";
```

### 4. Build do projeto

```bash
mvn clean install
```

## Como Executar

Execute a classe principal `Principal` localizada em:

```
src/main/java/br/com/alura/conversordemoedas/principal/Principal.java
```

### No IntelliJ IDEA
Clique com o botão direito em `Principal` → **Run**.

### Pelo terminal

```bash
mvn exec:java -Dexec.mainClass="br.com.alura.conversordemoedas.principal.Principal"
```

## Uso

1. Ao iniciar, um menu numérico será exibido no console
2. Escolha a opção desejada (1–6) para selecionar o tipo de conversão
3. Informe o valor a ser convertido
4. O resultado formatado será exibido imediatamente
5. Escolha "7" para sair do programa

## Estrutura de Pacotes

```
br.com.alura.conversordemoedas
├── modelos
│   ├── ExchangeResponse.java  # Mapeia JSON da API
│   └── Moeda.java            # Representa moeda e valor
├── servicos
│   ├── ConsultaAPI.java      # Cliente HTTP para ExchangeRate-API
│   └── ConversorMoeda.java   # Lógica de conversão
└── principal
    └── Principal.java        # Menu e interação com usuário
```

## Melhorias Futuras

- Histórico de conversões em sessão ou arquivo
- Validação avançada de entradas (ex.: caracteres não numéricos)
- Suporte a mais moedas via configuração externa
- Exportar relatórios em CSV ou JSON

---

**Desenvolvido para fins educacionais como parte do curso de Back-end Java da Alura.**
