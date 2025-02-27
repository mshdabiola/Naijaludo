### Data Module Graph

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
    :modules:data["data"]
    :modules:datastore["datastore"]
    :modules:model["model"]
    :modules:analytics["analytics"]
    :modules:testing["testing"]
  end
  :features:market --> :modules:data
  :features:game --> :modules:data
  :features:main --> :modules:data
  :app --> :modules:data
  :modules:data --> :modules:datastore
  :modules:data --> :modules:model
  :modules:data --> :modules:analytics
  :modules:data --> :modules:testing
  :features:setting --> :modules:data
  :modules:testing --> :modules:data

classDef focus fill:#FA8140,stroke:#fff,stroke-width:2px,color:#fff;
class :modules:data focus
```