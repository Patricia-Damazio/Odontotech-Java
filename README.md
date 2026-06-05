# Odontotech 🦷✨

O **Odontotech** é uma aplicação interativa via console desenvolvida para transformar o momento da escovação de dentes infantil em uma jornada divertida e gamificada. Através de um guia passo a passo com temporizador, o sistema incentiva as crianças a manterem uma rotina de higiene bucal correta e eficiente.

---

## 👩‍💻 Autora

* **Patrícia Damázio**
* **Status:** Estudante de Análise e Desenvolvimento de Sistemas (ADS).
* **Contexto:** Este é o meu primeiro projeto acadêmico de desenvolvimento de software, unindo o aprendizado de tecnologia à importância da saúde bucal pedagógica.
* **Data:** 05/06/2026

---

## 🎯 Escopo e Intuito da Aplicação

O principal objetivo do Odontotech é auxiliar pais e educadores na criação de hábitos saudáveis de higiene bucal para o **público-alvo infantil**. 

A aplicação funciona como um assistente de escovação em formato de jogo de console:
1. **Identificação:** A criança interage informando seu nome.
2. **Engajamento:** O sistema solicita que ela prepare a escova e a pasta antes de dar a largada.
3. **Cronômetro Guiado:** Um ciclo de escovação dividido em 4 etapas cruciais, simulando o tempo necessário para cada região da boca.
4. **Gamificação e Recompensa:** Ao concluir todo o processo, a criança celebra o término e recebe o troféu virtual **"Dente Brilhante"**, reforçando positivamente o comportamento.

---

## 🛠️ Stack Tecnológica

O projeto foi construído utilizando bases sólidas e profissionais do ecossistema Java:
* **Linguagem:** Java
* **Versão do Motor (JDK):** Java 17 (LTS)
* **Ambientes de Desenvolvimento Homologados:** VS code / IntelliJ IDEA Community Edition

---

## 🧭 Estrutura do Fluxo de Escovação

O programa executa de forma linear e didática as seguintes etapas:
* **Etapa 1:** Dentes da frente (Duração: 3 segundos)
* **Etapa 2:** Dentes do fundo - em cima (Duração: 3 segundos)
* **Etapa 3:** Dentes do fundo - embaixo (Duração: 3 segundos)
* **Etapa 4:** A língua (Duração: 3 segundos)

---

## 🚀 Como Rodar o Projeto

Para executar o Odontotech na sua máquina local, certifique-se de ter o **JDK 17** devidamente instalado e configurado nas suas variáveis de ambiente.

### No VS Code:
1. Abra a pasta raiz do projeto (`Odontotech-Java`) no Cursor.
2. Certifique-se de que a extensão **Extension Pack for Java** da Microsoft está ativa.
3. Abra o arquivo localizado em `src/Main.java`.
4. Clique no link **"Run"** que aparece flutuando logo acima da linha `public static void main` ou utilize o botão de triângulo verde (Play) no canto superior direito.
5. Acompanhe e responda às perguntas diretamente pelo painel do Terminal na parte inferior.

### No IntelliJ IDEA:
1. Abra o projeto no IntelliJ.
2. Aguarde a indexação inicial do projeto.
3. Abra o arquivo `Main.java` dentro da pasta `src`.
4. Pressione o atalho `Shift + F10` ou clique na seta verde de **Run** na barra superior para iniciar.

---

## 📝 Boas Práticas Aplicadas

Como um marco inicial na trajetória de engenharia de software, o código implementa:
* Controle de fluxo estruturado (`if / else if / else` e laços de repetição `for`).
* Simulação de concorrência com segurança utilizando o controle de pausas e interrupções do `Thread.sleep()`.
* Tratamento defensivo de entradas nulas ou vazias através de fallbacks textuais e higienização com `.trim()`.
* Gerenciamento correto de recursos de hardware fechando o fluxo do `Scanner` após a execução.