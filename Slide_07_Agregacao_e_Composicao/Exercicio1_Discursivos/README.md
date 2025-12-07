# 1. Cite quatro exemplos diferentes que podem ser considerados como agregação ou composição (dois de cada). 

### Agregação (Relacionamento Fraco)
Ocorre quando uma classe não depende da outra para existir. A "Parte" existe sem o "Todo".

* **Time e Jogador:** O Time é formado por jogadores, mas se o time for extinto, o jogador continua existindo (pode ir praa outro time).
* **Biblioteca e Livro:** A biblioteca tem um acervo de livros. Se a biblioteca fechar, os livros continuam existindo fisicamente.

### Composição (Relacionamento Forte)
Ocorre quando uma classe depende da outra para existir. A "Parte" não faz sentido sem o "Todo".

* **Casa e Cômodo:** Um cômodo (quarto, sala, cozinha) faz parte de uma casa. Se a casa for demolida, o cômodo não vai mais existir.
* **Corpo Humano e Coração:** O coração existe dentro do Corpo e é essencial para a vida do mesmo. Sem o corpo, o coração não tem função autônoma de vida no contexto do objeto.

---

# 2. O que acontece se uma classe for programada como final? E se um atributo for “setado” como final?

### Classe Final
Ela não pode ser herdada. Isso significa que não pode criar subclasses a partir dela (usando `extends`).
* **Erro gerado:** `Cannot inherit from final...`

### Atributo Final
Ele se torna uma constante. O valor dele não pode ser modificado após a inicialização.
* **Erro gerado:** `Cannot assign a value to final variable`

---

# 3. Qual a vantagem de programar um método estático? 

A principal vantagem é poder acessar e executar o método sem a necessidade de instanciar um objeto (ou seja, sem criar um `new Objeto()`).

A chamada é feita diretamente pela classe. É muito útil praa funções utilitárias ou matemáticas que não dependem de atributos, como o `Util.separador()` ou `Math.sqrt(9)`

---

# 4. Pesquise e cite mais dois métodos que fazem parte da classe Object

Além dos métodos já citados no slide (`equals`, `toString`, `hashCode`, `getClass`), cito mais alguns que existem na documentação oficial do JAVA.

1.  `clone()`
    * Cria e retorna uma cópia exata do objeto atual. É usado quando precisamos duplicar um objeto preservando seu estado atual.

2.  `wait()`
    * Faz com que a *thread* (linha de execução) atual espere até que outra thread notifique que pode prosseguir. Fundamental para programação concorrente.