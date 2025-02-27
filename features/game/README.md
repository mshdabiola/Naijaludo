### Game Module Graph

```mermaid
%%{
  init: {
    'theme': 'base',
    'themeVariables': {"primaryTextColor":"#fff","primaryColor":"#5a4f7c","primaryBorderColor":"#5a4f7c","lineColor":"#f5a623","tertiaryColor":"#40375c","fontSize":"12px"}
  }
}%%

graph LR
  subgraph :features
    :features:game["game"]
  end
  subgraph :modules
    :modules:data["data"]
    :modules:model["model"]
    :modules:ui["ui"]
    :modules:designsystem["designsystem"]
    :modules:analytics["analytics"]
    :modules:testing["testing"]
  end
  :features:game --> :modules:data
  :features:game --> :modules:model
  :features:game --> :modules:ui
  :features:game --> :modules:designsystem
  :features:game --> :modules:analytics
  :features:game --> :
  :features:game --> :modules:testing
  :app --> :features:game

classDef focus fill:#FA8140,stroke:#fff,stroke-width:2px,color:#fff;
class :features:game focus
```