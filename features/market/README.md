### Market Module Graph

```mermaid
%%{
  init: {
    'theme': 'base',
    'themeVariables': {"primaryTextColor":"#fff","primaryColor":"#5a4f7c","primaryBorderColor":"#5a4f7c","lineColor":"#f5a623","tertiaryColor":"#40375c","fontSize":"12px"}
  }
}%%

graph LR
  subgraph :features
    :features:market["market"]
  end
  subgraph :modules
    :modules:data["data"]
    :modules:model["model"]
    :modules:ui["ui"]
    :modules:designsystem["designsystem"]
    :modules:analytics["analytics"]
    :modules:testing["testing"]
  end
  :features:market --> :modules:data
  :features:market --> :modules:model
  :features:market --> :modules:ui
  :features:market --> :modules:designsystem
  :features:market --> :modules:analytics
  :features:market --> :
  :features:market --> :modules:testing
  :app --> :features:market

classDef focus fill:#FA8140,stroke:#fff,stroke-width:2px,color:#fff;
class :features:market focus
```