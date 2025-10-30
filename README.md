# 🔄 Padrão State – Relatório Financeiro

Este projeto demonstra a aplicação do **padrão comportamental State** em **Java**, no contexto de **relatórios financeiros**.  
O objetivo é mostrar como permitir que um **objeto altere seu comportamento dinamicamente** conforme seu **estado interno muda**, delegando essa lógica para **classes específicas de estado**.  

> 💡 O padrão **State** elimina condicionais complexas, facilita a manutenção e torna o ciclo de vida do relatório **claro, modular e extensível**.

---

## 🧠 O que é o padrão State?

O **State** é um **padrão comportamental** que **encapsula o comportamento dependente do estado** em classes separadas.  
O **objeto contexto** (no caso, o relatório financeiro) mantém uma **referência para o estado atual** e **delegará suas operações** para o objeto de estado correspondente.

Assim, o relatório **muda de comportamento automaticamente** conforme seu estado evolui.

> 🔁 Em vez de usar `if` e `switch` espalhados pelo código, o comportamento é controlado por **classes de estado dedicadas**.

---

## 💼 Cenário: Ciclo de Vida do Relatório Financeiro

O relatório financeiro passa por **vários estados**, representando seu ciclo de vida completo:

| Estado | Descrição |
|--------|------------|
| 🕓 **Pendente** | Criado, aguardando envio para análise. |
| 🔍 **Em Análise** | Sob avaliação por revisores. |
| ✅ **Aprovado** | Autorizado para publicação. |
| ❌ **Rejeitado** | Necessita ajustes; pode retornar à análise. |
| 📢 **Publicado** | Disponibilizado oficialmente. |

Cada estado define **regras específicas** sobre quais ações são válidas e quais transições podem ocorrer.
