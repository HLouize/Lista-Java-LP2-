## Questão 1

### 2. O que acontece durante a compilação?
Ocorre um erro de compilação. O compilador impede a geração do programa e exibe uma mensagem informando que a classe é abstrata e não pode ser instanciada.

### 3. Justificativa do erro
Esse erro ocorre porque classes declaradas com o modificador `abstract` funcionam apenas como modelos conceituais ou superclasses abstratas. Como elas representam apenas um conceito genérico e podem conter métodos abstratos, o compilador do Java bloqueia preventivamente qualquer tentativa de usar o operador `new` nessas classes para garantir a segurança do código.

---

## Questão 3

### 1. O método emitirSom() executado é o da classe Animal ou da subclasse?
O método executado é o da subclasse correspondente ao objeto real que foi instanciado em memória.

### 2. Como isso é possível?
Isso é possível por meio do mecanismo de polimorfismo combinado com a ligação tardia. Em tempo de execução, a JVM analisa o tipo real do objeto alocado no bloco de memória e não o tipo da variável de referência que o aponta, executando assim o comportamento especializado e sobrescrito da subclasse.