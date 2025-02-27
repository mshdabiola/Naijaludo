### Ludo Module Graph

```mermaid
%%{
  init: {
    'theme': 'base',
    'themeVariables': {"primaryTextColor":"#fff","primaryColor":"#5a4f7c","primaryBorderColor":"#5a4f7c","lineColor":"#f5a623","tertiaryColor":"#40375c","fontSize":"12px"}
  }
}%%

graph LR
  subgraph :modules
    :modules:model["model"]
    :modules:naijaludo["naijaludo"]
    :modules:testing["testing"]
  end
  :modules:model --> :modules:naijaludo
  :modules:naijaludo --> :modules:testing

classDef focus fill:#FA8140,stroke:#fff,stroke-width:2px,color:#fff;
class :modules:naijaludo focus
```