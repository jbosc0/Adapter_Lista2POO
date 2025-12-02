# Atividade usando o Padrão Adapter

Este projeto implementa o padrão **Adapter** para integrar o sistema de pagamento antigo (**MPay**) ao novo sistema (**PPay**).  
As interfaces são incompatíveis e, portanto, é necessário criar um adaptador (`MPayAdapter`) que traduza chamadas da interface nova para a antiga sem alterar o código legado.

---

## Sistemas fornecidos

### Sistema antigo (legado)
- **MPay.java** — interface original
- **MpayImpl.java** — implementação antiga

### Sistema novo
- **PPay.java** — interface que o novo sistema exige

---

## Solução (Adapter)

A classe **`MPayAdapter`**:

- implementa **PPay**
- armazena internamente um objeto **MPay**
- traduz cada método de PPay para o método equivalente de MPay
- converte tipos (ex.: `Integer` → `Short`)
- converte formatos de data (ex.: `"08/2028"` → mês + ano separados)

Com isso, qualquer objeto MPay pode ser utilizado como se fosse PPay.

---

## Teste solicitado

A classe `PagamentoTeste.java` utiliza o método:

```java
testPPay(PPay ppay)
