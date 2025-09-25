# 💼 Exercício – Lista de Funcionários em Java

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-purple?logo=intellij-idea)

## 📌 Enunciado
Fazer um programa para:
1. Ler um número inteiro **N** representando a quantidade de funcionários a serem registrados.
2. Ler os dados de cada funcionário: **id, nome e salário**.
    - Não deve haver repetição de id.
3. Efetuar o aumento de **X%** no salário de um determinado funcionário:
    - O programa deve ler o **id** e o valor de **X**.
    - Se o id informado não existir, mostrar uma mensagem e abortar a operação.
4. Ao final, mostrar a listagem atualizada dos funcionários.

⚠️ **Encapsulamento:** o salário não pode ser alterado livremente. Só pode ser modificado através da operação de aumento por porcentagem.

---

## 📥 Exemplo de entrada
```
How many employees will be registered? 3

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Employee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase: 536
Enter the percentage: 10.0
```

---

## 📤 Saída esperada
```
List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00
```

Exemplo quando o ID não existe:
```
Enter the employee id that will have salary increase: 776
This id does not exist!

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3000.00
```

---

## 🎯 Conceitos praticados
- **Listas** (`ArrayList`) em Java.
- **Streams e filtros** para localizar elementos por ID.
- **Encapsulamento** e uso de métodos de atualização controlada.
- Leitura de dados com `Scanner`.
- Organização de código com **métodos auxiliares** e classes (`Employee`).