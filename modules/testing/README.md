### Testing Module Graph

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
    :features:game["game"]
    :features:main["main"]
    :features:setting["setting"]
  end
  subgraph :modules
    :modules:testing["testing"]
    :modules:model["model"]
    :modules:naijaludo["naijaludo"]
    :modules:data["data"]
    :modules:ui["ui"]
    :modules:datastore["datastore"]
    :modules:analytics["analytics"]
    :modules:designsystem["designsystem"]
  end
  :features:market --> :modules:testing
  :modules:model --> :modules:testing
  :features:game --> :modules:testing
  :modules:naijaludo --> :modules:testing
  :features:main --> :modules:testing
  :app --> :modules:testing
  :modules:data --> :modules:testing
  :modules:ui --> :modules:testing
  :modules:datastore --> :modules:testing
  :modules:analytics --> :modules:testing
  :features:setting --> :modules:testing
  :modules:designsystem --> :modules:testing
  :modules:testing --> :modules:analytics
  :modules:testing --> :modules:data
  :modules:testing --> :modules:model
  :modules:testing --> :modules:designsystem
  :modules:testing --> :modules:ui

classDef focus fill:#FA8140,stroke:#fff,stroke-width:2px,color:#fff;
class :modules:testing focus
```