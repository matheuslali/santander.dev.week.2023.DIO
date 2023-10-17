# Santander Dev Week 2023 DIO
Java RESTful API criada na aula da DIO para o Santander Dev Week 2k23

## Diagrama de classes

``` mermaid

classDiagram
  class User {
    - name: string
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: string
    - agency: string
    - balance: string
    - limit: string
  }

  class Feature {
    - icon: string
    - description: string
  }

  class Card {
    - number: string
    - limit: string
  }

  class News {
    - icon: string
    - description: string
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
